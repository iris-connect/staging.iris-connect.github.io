import os

from .base import BaseBuilder
from pathlib import Path
from urllib.parse import urlparse
import glob
import shutil
import logging
import traceback

logger = logging.getLogger(__name__)

class PagesBuilder(BaseBuilder):

    def __init__(self, site):
        super().__init__(site)
        self.pages_by_language = {}
        self.resourcefilters = {}
        self.resourcerelation = '.'

    def index(self, params, language):
        pages = self.parse_pages(params.get('pages', []), language)
        self.resourcefilters = params.get('resources', [])
        self.resourcerelation = params.get('resourcerelation', '.')
        self.pages_by_language[language] = pages
        links, link_attrs = self.create_links(pages, language)
        return {
            'links' : links,
            'link_attrs' : link_attrs,
            'vars' : {
                'pages' : pages
            }
        }

    def create_links(self, pages, language):
        links = {}
        link_attrs = {}
        for page in pages:
            if not 'src' in page:
                continue
            names = [page['name']]
            if page.get('index'):
                names.append('')
                # this is the index page
                if '' in links:
                    logger.warning("Multiple index pages defined.")
            for name in names:
                links[name] = page['link']
                link_attrs[name] = page.get('attrs', {})
        return links, link_attrs

    def build(self):
        for language, pages in self.pages_by_language.items():
            for page in pages:
                if not 'src' in page:
                    continue
                self.build_page(page, language)

    def build_page(self, page, language):
        vars = {
            'page' : page,
            'name' : page['name'],
        }
        cp = page
        titles = []
        while cp is not None:
            if 'title' in cp:
                titles += [str(cp['title'])]
            cp = cp.get('parent')
        if titles:
            vars['title'] = ' - '.join(titles[::-1])
        input = self.site.load(page['src'])
        try:
            output = self.site.process(input, page, vars, language)
        except:
            logger.error("An error occured when processing page '{}' in language '{}'"\
                .format(page['name'], language))
            logger.error(traceback.format_exc())
            raise
        self.site.write(output, page['dst'])
        self.copy_resources(page)

    def copy_resources(self, page):
        files_grabbed = []
        folder = Path(os.path.join(Path(self.parse_src_path(page['src'])).parent, self.resourcerelation))
        for files in self.resourcefilters:
            files_grabbed.extend(folder.glob(files))
        dest = Path(os.path.join(Path(self.site.get_build_path(page['dst'])).parent), self.resourcerelation)
        if files_grabbed and not os.path.exists(dest):
            os.mkdir(dest)
        for file in files_grabbed:
            shutil.copy(file, dest)

    def parse_src_path(self, src):
        o = urlparse(src)
        return self.site.get_src_path(src[len(o.scheme) + 3:])

    def flatten_pages(self, pages):
        """
        Flattens the page hierarchy into a single list, replacing the
        names to reflect the page structure.
        """
        flat_pages = []
        def add_pages(pages, prefix):
            for page in pages:
                new_page = page.copy()
                new_page['children'] = []
                if prefix:
                    new_page['name'] = '.'.join(prefix+[new_page['name']])
                flat_pages.append(new_page)
                if 'children' in page:
                    add_pages(page['children'], prefix+[page['name']])
        add_pages(pages, [])
        return flat_pages 

    def parse_pages(self, pages, language):
        flat_pages = self.flatten_pages(pages)
        pages = self.site.parse_objs(flat_pages, language)
        page_index = {page['name'] : page for page in pages}
        new_slugs = {}
        #we parse child pages and generate appropriate links
        for page in pages:
            components = page['name'].split('.')
            if len(components) > 1:
                full_slug = []
                for i in range(1, len(components)+1):
                    name = '.'.join(components[:i])
                    if name in page_index:
                        page_slug = page_index[name]['slug']
                        if page_slug.startswith('/'):
                            full_slug = [page_slug[1:]]
                        else:
                            full_slug.append(page_slug)
                new_slugs[page['name']] = '/'.join(full_slug)
                page['level'] = len(components)-1
                parent = '.'.join(components[:-1])
                if parent in page_index:
                    parent_page = page_index[parent]
                    page['parent'] = parent_page
                    if not 'children' in parent_page:
                        parent_page['children'] = []
                    parent_page['children'].append(page)
                else:
                    logger.warning("No parent found for page {}".format(page['name']))
            else:
                page['level'] = 0
        #we update the slugs for the child pages
        for name, slug in new_slugs.items():
            page = page_index[name]
            extension = page.get('extension', 'html')
            page['slug'] = slug
            page['dst'] = self.site.get_dst(slug, language, extension=extension)
            page['link'] = self.site.get_link_dst(slug, language, extension=extension)
        return pages
