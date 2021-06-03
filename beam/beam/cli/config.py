from beam import Site
from beam.config import load_config

import logging
import yaml
import json
import click
import os

logger = logging.getLogger(__name__)

@click.command("config")
@click.option("--site", default=None)
@click.option("--as-json", default=False, is_flag=True)
def config(site, as_json):
    if site is None:
        for site in ['site.yml', 'src/site.yml']:
            if os.path.exists(site):
                break
    if not os.path.exists(site):
        logger.error("Site configuration not found.")
        return -1
    config = load_config(site)
    if as_json:
        result = json.dumps(config, indent=2, sort_keys=True)
    else:
        result = yaml.dump(config, width=60, indent=2, sort_keys=True, allow_unicode=True, encoding='utf-8').decode('utf-8')
    click.echo(result)

