
class BaseProcessor(object):

    def translate(self, key, *args, **kwargs):
        return self.site.translate(self.language, key, *args, **kwargs)

    def file(self, filename):
        return self.site.request('static_file', filename)

    def source_path(self, filename):
        return self.site.request('source_path', filename)

    def href(self, href, language=None):
        if language is None:
            language = self.language
        return self.site.href(language, href)

    def full_href(self, href, language=None):
        if language is None:
            language = self.language
        return self.site.full_href(language, href)

    def __init__(self, site, params, language):
        self.plaintext = False
        self.site = site
        self.params = params
        self.language = language
    