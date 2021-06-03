import logging
import click

import beam.i18n as i18n_module

logger = logging.getLogger(__name__)

@click.group("i18n")
def i18n():
    pass

@i18n.command()
@click.option('-c', '--clean', default=False, is_flag=True)
@click.argument("token")
@click.argument("src_path")
def translate_config(token, src_path, clean=False):
    i18n_module.translate_config(token, src_path, clean=clean)

@i18n.command()
@click.option('-c', '--clean', default=False, is_flag=True)
@click.argument("token")
@click.argument("src_path")
def translate_markdown(token, src_path, clean=False):
    i18n_module.translate_markdown(token, src_path, clean=clean)

@i18n.command()
@click.option('-c', '--clean', default=False, is_flag=True)
@click.argument("token")
@click.argument("src_path")
def translate_strings(token, src_path, clean=False):
    i18n_module.translate_strings(token, src_path, clean=clean)

@i18n.command()
@click.option('-c', '--clean', default=False, is_flag=True)
@click.argument("token")
@click.argument("src_path")
def translate(token, src_path, clean=False):
    i18n_module.translate_markdown(token, src_path, clean=clean)
    i18n_module.translate_strings(token, src_path, clean=clean)
    i18n_module.translate_config(token, src_path, clean=clean)
