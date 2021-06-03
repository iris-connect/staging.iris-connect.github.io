import os
import requests
from .yaml import yaml
from .hash import hash

import logging

logger = logging.getLogger(__name__)

class FileCache:

    def __init__(self, filename):
        self.filename = filename
        self.used = set()
        self.read()

    def read(self):
        if os.path.exists(self.filename):
            with open(self.filename) as input_file:
                content = input_file.read()
                if content.strip() == "": # we ignore empty files
                    self.tr = {}
                else:
                    self.tr = yaml.load(content, Loader=yaml.BaseLoader)
        else:
            self.tr = {}

    def write(self):
        with open(self.filename, 'wb') as output_file:
            output_file.write(yaml.dump(self.tr, indent=2, sort_keys=True, width=60, allow_unicode=True, encoding="utf-8"))

    def update_hashes(self, source_language):
        new_tr = {}
        for hh, items in self.tr.items():
            lang_item = items.get(source_language)
            if not lang_item:
                continue
            new_hh = hash(lang_item)
            new_tr[new_hh] = items
        self.tr = new_tr


    def get(self, text, language, source_language=None):
        hh = hash(text)
        self.used.add(f"{hh}")
        if not hh in self.tr or not language in self.tr[hh]:
            return None
        if source_language:
            if not self.has(text, source_language):
                self.set(text, source_language, text)
        return self.tr[hh][language]

    def has(self, text, language):
        hh = hash(text)
        return hh in self.tr and language in self.tr[hh]

    def set(self, text, language, translation, source_language=None):
        hh = hash(text)
        if not hh in self.tr:
            self.tr[hh] = {}
        self.tr[hh][language] = translation
        if source_language:
            self.tr[hh][source_language] = text
        self.write()

    def clean(self):
        for hh, hash_values in list(self.tr.items()):
            if not f"{hh}" in self.used:
                del self.tr[hh]
        self.write()

def cached_translate(text, source_language, target_language, cache, token):
    existing_translation = cache.get(text, target_language, source_language=source_language)
    if existing_translation:
        return existing_translation
    translation = translate(text, source_language, target_language, token)
    cache.set(text, target_language, translation, source_language=source_language)
    return translation

def translate(text, source_language, target_language, token):
    logger.info(f"Translating: '{text}'")
    response = requests.post("https://api.deepl.com/v2/translate", data={
        "auth_key": token,
        "text": text,
        "source_lang": source_language,
        "target_lang": target_language,
        "preserve_formatting": "0",
        # formality currently doesn't work for Chinese, Spanish and Japanese
        # To do: Regularly check if this is still true...
        "formality": "more" if target_language not in ['es', 'zh', 'ja', 'en'] else "default",
        "ignore_tags": "ignore,code,tr-ignore,md-code",
        "tag_handling": "xml",
        })
    if response.status_code != 200:
        logger.error(response.json())
        response.raise_for_status()
    translation = response.json()["translations"][0]["text"]
    logger.info(f"Translation: '{translation}'")
    return translation
