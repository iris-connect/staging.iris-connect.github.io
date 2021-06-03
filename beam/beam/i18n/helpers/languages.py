from .yaml import yaml
import os
import sys

def get_all_languages(src_path):
    args = sys.argv[1:]

    site_path = os.path.join(src_path, "site-i18n.yml")

    with open(site_path) as input_file:
        config = yaml.load(input_file.read(), Loader=yaml.FullLoader)

    return config["languages"].keys()

def get_source_and_target_languages(src_path, context, exclude_source=True):

    args = sys.argv[1:]

    site_path = os.path.join(src_path, "site-i18n.yml")

    with open(site_path) as input_file:
        config = yaml.load(input_file.read(), Loader=yaml.FullLoader)

    source_language = 'en'
    if '--tl' in args:
        for i, k in enumerate(args):
            if k == '--tl':
                target_languages = [tl.strip() for tl in args[i+1].split(",")]
                break
    else:
        target_languages = [tl for tl in config['languages'].keys() if not tl.startswith('$')]

    if '--sl' in args:
        for i, k in enumerate(args):
            if k == '--sl':
                source_language = args[i+1].split()
                break
    else:
        source_language = config['i18n'].get('source_language', {}).get(context, 'en')

    return source_language, [tl for tl in target_languages if not tl == source_language or not exclude_source]