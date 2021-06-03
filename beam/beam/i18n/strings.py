import re
import os
import logging
import traceback

from .helpers.hash import hash
from .helpers.yaml import yaml
from .helpers.translate import translate
from .helpers.languages import get_source_and_target_languages
from .helpers.serialize import serialize_text, deserialize_text

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("")

def translate_data(token, data, source_language, target_language, parent=None):
    count = 0
    for key, value in data.items():
        if isinstance(value, dict):
            if source_language in value:
                source_text = value[source_language]
                # we strip multiple newlines and other stuff, as it confuses DeepL
                source_text = re.sub(r"[\s\n\t]+", " ", source_text)
                value[source_language] = source_text
                source_text = serialize_text(source_text)
                source_hash = hash(source_text)
                full_key = key
                if parent:
                    full_key = f'{parent}.{key}'
                if not '_t' in value:
                    value['_t'] = {}
                _t = value['_t']
                _i = value.get('_i', set())
                # we ignore the target language if it's listed in the '_i' field
                if target_language in _i:
                    logger.debug(f"Ignoring translation for key '{full_key}' to language '{target_language}'...")
                    continue
                _t[source_language] = source_hash
                # we check if we already translated this...
                if target_language in _t and _t[target_language] == source_hash:
                    logger.debug(f"Hash still ok for key '{full_key}', skipping...")
                    continue
                # we remember the hash of the source text, so we don't translate
                # it again un-necessarily...
                _t[target_language] = source_hash
                print(f"Translating '{full_key}' from '{source_language}' to '{target_language}'")
                count += len(source_text)
                value[target_language] = deserialize_text(translate(source_text, source_language, target_language, token))
            else:
                try:
                    count += translate_data(token, value, source_language, target_language, parent=key if parent is None else parent+'.'+key)
                except:
                    logger.error(traceback.format_exc())
                    continue
    return count

def translate_file(token, path, source_language, target_languages):
    count = 0
    with open(path) as input_file:
        data = yaml.load(input_file.read(), Loader=yaml.FullLoader)
    for target_language in target_languages:
        count += translate_data(token, data, source_language, target_language)
    with open(path, "wb") as output_file:
        output_file.write(yaml.dump(data, width=60, allow_unicode=True, encoding="utf-8", indent=2, sort_keys=True))
    return count

def translate_strings(token, src_path, clean=False):

    translations_path = os.path.join(src_path, "translations")
    source_language, target_languages = get_source_and_target_languages(src_path, "strings")

    logger.info(f"Translating strings from '{source_language}' to '{', '.join(target_languages)}'...")

    for root, dirs, files in os.walk(translations_path):
        for filename in files:
            if filename.endswith(".yml"):
                path = os.path.join(root, filename)
                count = translate_file(token, path, source_language, target_languages)
                if count:
                    print(f"Translated {count} characters in file {path}")
