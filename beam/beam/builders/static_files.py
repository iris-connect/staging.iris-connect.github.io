from .base import BaseBuilder

import logging
import shutil
import os

logger = logging.getLogger(__name__)

class StaticFilesBuilder(BaseBuilder):

    def __init__(self, site):
        super().__init__(site)
        self._static_paths = None
        self.providers = {
            'static_file' : self.get_path,
            'source_path': self.get_source_path
        }

    def postprocess(self):
        self.copy_static_files()

    def copy_static_files(self):
        dirs = self.get_static_paths()
        for dir in dirs:
            for path, dirs, files in os.walk(dir):
                relpath = os.path.relpath(path, dir)
                for dirname in dirs:
                    dest_path = os.path.join(self.site.build_path, self.site.static_path, relpath, dirname)
                    if os.path.exists(dest_path) and not os.path.isdir(dest_path):
                        shutil.rmtree(dest_path)
                    elif not os.path.exists(dest_path):
                        os.makedirs(dest_path)
                for filename in files:
                    src_path = os.path.join(path, filename)
                    dest_path = os.path.join(self.site.build_path, 
                                             self.site.static_path,
                                             relpath,
                                             filename)
                    if not os.path.exists(dest_path) or \
                      os.stat(dest_path).st_mtime < os.stat(src_path).st_mtime:
                        shutil.copy(src_path, dest_path)

    def resolve_path(self, path):
        dirs = self.get_static_paths()
        for dir in dirs:
            full_path = os.path.join(dir, path)
            if os.path.exists(full_path):
                return full_path
        logger.error("Path '{}' not found!".format(path))

    def get_source_path(self, path):
        dirs = self.get_static_paths()
        for dir in dirs:
            full_path = os.path.join(dir, path)
            if os.path.exists(full_path):
                return full_path


    def get_path(self, path):
        full_path = self.resolve_path(path)
        if not full_path:
            return
        return os.path.join(self.site.path, self.site.static_path, path)

    def get_static_paths(self):
        if self._static_paths is not None:
            return self._static_paths
        paths = [os.path.join(self.site.src_path, 'static')]
        for language in self.site.config.get('languages', {}):
            static_path = os.path.join(self.site.src_path, '{}/static'.format(language))
            if os.path.exists(static_path):
                paths.append(static_path)
        self._static_paths = paths
        return paths

