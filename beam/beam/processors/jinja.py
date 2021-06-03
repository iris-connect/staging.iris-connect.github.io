from .base import BaseProcessor

from collections import defaultdict
from urllib.parse import quote

import logging
import yaml
import markdown2
import textwrap
import os
import re

logger = logging.getLogger(__name__)

with_pil = False

try:
    from PIL import Image, UnidentifiedImageError
    with_pil = True
except ImportError:
    pass

from jinja2 import Environment, FileSystemLoader, ChoiceLoader, DictLoader

try:
    from pygments import highlight
    from pygments.styles import get_style_by_name
    from pygments.lexers import get_lexer_by_name
    from pygments.formatters import HtmlFormatter
    with_pygments = True
except ImportError:
    with_pygments = False

try:
    from bs4 import BeautifulSoup as bs
    with_bs = True
except ImportError:
    with_bs = False

class JinjaProcessor(BaseProcessor):

    def highlight_styles(self, code, style_name=None, style_class=None):
        if style_class is None:
            style_class = self.site.config.get('pygments', {}).get('class', 'highlight')
        explicit = True
        if style_name is None:
            explicit = False
            style_name = self.site.config.get('pygments', {}).get('style', 'monokai')
        style = get_style_by_name(style_name)
        class_name = f'.{style_class}'
        if explicit:
            class_name += f' .{style_name}'
        return '<style type="text/css">{}</style>'.format(HtmlFormatter(style=style).get_style_defs(class_name))

    def highlight(self, code, language='python', style_name=None, style_class=None, strip=True, deindent=True):
        if style_name is None:
            style_name = self.site.config.get('pygments', {}).get('style', 'monokai')
        lexer = get_lexer_by_name(language)
        style = get_style_by_name(style_name)
        if deindent:
            code = textwrap.dedent(code)
        if strip:
            code = code.strip()
        return highlight(code, lexer, HtmlFormatter(style=style, cssclass=f'{style_name}'))

    def toyaml(self, code, *args, **kwargs):
        return yaml.dump(code, *args, **kwargs)

    def picture(self, filename, prefs=['webp', 'png', 'jpeg'], sizes='50vw', **kwargs):
        file_path = self.file(filename)
        file_dir = os.path.dirname(file_path)
        if not file_path:
            return ""
        source_path = self.source_path(filename)
        filename = os.path.basename(source_path)
        source_dir = os.path.dirname(source_path)
        basename, zoom, ext = re.match(r"^(.*?)(?:@(\d+x))?\.(.*)$", filename).groups()
        extra_args = []
        for k, v in kwargs.items():
            extra_args.append(f'{k}="{v}"')
        extra_args = " ".join(extra_args)
        files = os.listdir(source_dir)
        alternatives = defaultdict(list)
        for fname in files:
            if re.match("{}(?:@\d+x)?\.\w+$".format(re.escape(basename)), fname):
                _, zoom, ext = re.match(r"^(.*?)(?:@(\d+x))?\.(.*)$", fname).groups()
                if zoom is None:
                    zoom = '1x'
                if with_pil:
                    try:
                        # we determine the exact image width to include
                        image = Image.open(os.path.join(source_dir, fname))
                        zoom = '{}w'.format(image.size[0])
                    except UnidentifiedImageError:
                        # we cannot properly read this image, ignore it
                        logger.warning(f"Cannot read image {source_dir}/{fname}, ignoring its size...")
                        pass
                alternatives[ext].append((fname, zoom))

        html_alternatives = ""

        sizestr = ""
        if sizes:
            sizestr = f'sizes="{sizes}"'

        def generate_alternative(ext, ext_alternatives):

            alts = []
            for f, z in ext_alternatives:
                fp = quote(f"{file_dir}/{f}")
                alts.append(f"{fp} {z}")
            joined_alternatives = ", ".join(alts)
            return f"""
    <source type="image/{ext}" srcset="{joined_alternatives}" {sizestr}>
"""

        # we add the preferred formats first
        for pref in prefs:
            if pref in alternatives:
                html_alternatives += generate_alternative(pref, alternatives[pref])
        # then we add the rest
        for ext, ext_alternatives in alternatives.items():
            if not ext in prefs:
                html_alternatives += generate_alternative(ext, ext_alternatives)
        return f"""
<picture>
    {html_alternatives}
    <img src="{file_path}" {extra_args}>
</picture>
"""

    def markdown(self, text):
        result = markdown2.markdown(text, extras=['footnotes', 'fenced-code-blocks'])
        return result

    def translate(self, key, *args, **kwargs):
        result = super().translate(key, *args, **kwargs)
        translate_hint = self.site.config.get('translate-hint')
        if translate_hint:
            return translate_hint.format(value=result, key=key, args=args, kwargs=kwargs)
        return result

    def jinja(self, vars, input, **kwargs):
        context = vars.copy()
        context.update(kwargs)
        return self.process(input, context)

    def get_jinja_env(self, input, vars):
        dict_loader = DictLoader({'input' : input})
        choice_loader = ChoiceLoader([dict_loader, FileSystemLoader('{}/templates'.format(self.site.src_path)), FileSystemLoader(self.site.src_path)])
        env = Environment(loader=choice_loader)

        # we add some useful filters
        env.filters['href'] = self.href
        env.filters['toyaml'] = self.toyaml
        env.filters['full_href'] = self.full_href
        env.filters['file'] = self.file
        env.filters['markdown'] = self.markdown
        env.filters['picture'] = self.picture
        env.filters['jinja'] = lambda input, **kwargs: self.jinja(vars, input, **kwargs)
        if with_pygments:
            env.filters['highlight'] = self.highlight
            env.filters['highlight_styles'] = self.highlight_styles
        env.filters['translate'] = self.translate
        env.filters['t'] = self.translate
        #env.filters['dt'] = self.direct_translate
        for filters in self.site.addons['jinja-filters']:
            for name, f in filters:
                env.filters[name] = f
        return env

    def process(self, input, vars):
        env = self.get_jinja_env(input, vars)
        template = env.get_template('input')
        result = template.render(**vars)
        if with_bs and False:
            soup=bs(result, "html.parser")
            return soup.prettify()
        return result