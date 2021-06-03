import re
import base64

def serialize_code(match):
    """
    We retain the original value inside because it can provide meaningful context
    to the translation API. However, we ignore the translated value.
    """
    bi = base64.urlsafe_b64encode((match.group(0)).encode("utf-8")).decode("ascii")
    return f"<md-code v=\"{bi}\" />"

def deserialize_code(match):
    bs = base64.urlsafe_b64decode(match.group(1)).decode("utf-8")
    return bs

def serialize_ignore(match):
    # brackets don't match, we ignore this
    if len(match.group(2)) != len(match.group(4)):
        return match.group(0)
    # we don't replace anything that's already inside an HTML tag
    if re.match(r".*?<[^>]*$", match.group(1)):
        return match.group(0)
    bi = base64.urlsafe_b64encode((match.group(2)+match.group(3)+match.group(4)).encode("utf-8")).decode("ascii")
    return f"{match.group(1)}<ignore v=\"{bi}\" />"

def deserialize_ignore(match):
    bs = base64.urlsafe_b64decode(match.group(1)).decode("utf-8")
    return bs

def serialize_md_link(match):
    if len(match.groups()) == 2:
        bi = base64.urlsafe_b64encode(match.group(2).encode("utf-8")).decode("ascii")
        return f"<md-link href=\"{bi}\">{match.group(1)}</md-link>"
    else:
        return f"<md-link>{match.group(1)}</md-link>"

def deserialize_md_link(match):
    if len(match.groups()) == 2:
        bs = base64.urlsafe_b64decode(match.group(1)).decode("utf-8")
        return f"[{match.group(2)}]({bs})"
    else:
        return f"[{match.group(1)}]"
    return bs

def serialize_tr_hint(match):
    bi = base64.urlsafe_b64encode(match.group(2).encode("utf-8")).decode("ascii")
    return f"<tr-hint v=\"{bi}\">{match.group(1)}</tr-hint>"

def deserialize_tr_hint(match):
    bs = base64.urlsafe_b64decode(match.group(1)).decode("utf-8")
    return bs

def deserialize_text(text):
    """
    Undoes what the serialization did below.
    """

    # sometimes space after/before XML tags gets removed, we fix that here
    # after
    text = re.sub(r"</([a-zA-Z\-]+)>([^$\,\.\;\<\n\s\(\)\]\[])", "</\\1> \\2", text)
    # before
    text = re.sub(r"([\,\.\;\)a-zA-Z0-9])<([a-zA-Z])", "\\1 <\\2", text)

    text = re.sub(r"<tr-hint\s+v=\"(.*?)\"\s*>(.*?)</tr-hint>", deserialize_tr_hint, text)
    text = re.sub(r"<md-heading\s+v=\"(.*?)\"\s*>(.*?)</md-heading>", "\\1 \\2", text)
    text = re.sub(r"<md-list\s+v=\"(.*?)\"\s*>(.*?)</md-list>", "\\1 \\2", text)
    text = re.sub(r"<md-it>(.*?)</md-it>", "*\\1*", text)
    text = re.sub(r"<md-strong>(.*?)</md-strong>", "**\\1**", text)
    text = re.sub(r"<md-code\s+v=\"(.*?)\"\s*/>", deserialize_code, text)
    text = re.sub(r"<md-strong-it>(.*?)</md-strong-it>", "***\\1***", text)
    text = re.sub(r"<md-link\s+href=\"(.*?)\"\s*>(.*?)</md-link>", deserialize_md_link, text)
    text = re.sub(r"<md-link>(.*?)</md-link>", deserialize_md_link, text)
    # ignore needs to be deserialized last, as it can occur encoded e.g. in a
    # markdown link that was converted itself...
    text = re.sub(r"<ignore\s+v=\"(.*?)\"\s*/>", deserialize_ignore, text)
    text = text.replace("&amp;", "&")
    return text

def serialize_text(text):
    """
    Serializes text so that DeepL can effectively translate it.

    Currently, this replaces both common Markdown directives and some Jinja
    directives that might get in the way of a proper translation.
    """
    return serialize_plaintext(text)

def serialize_plaintext(text):
    # we ignore everything inside backticks

    text = re.sub(r"`.*?`", serialize_code, text)
    text = re.sub(r"<tr-hint\s+v=\"(.*?)\"\s*>(.*?)</tr-hint>", serialize_tr_hint, text)

    # we ignore everything inside unescaped brackets ({...})
    text = re.sub(r"(.*?)((?:(?!\\)\$)+)(.*?)((?:(?!\\)\$)+)", serialize_ignore, text)
    text = re.sub(r"(.*?)((?:(?!\\)\{)+)(.*?)((?:(?!\\)\})+)", serialize_ignore, text)
    # we replace Markdown headings
    text = re.sub(r"(?:\n|^)(\#+)\s*(.*?)$", "<md-heading v=\"\\1\">\\2</md-heading>", text, re.MULTILINE)
    # we replace Markdown list elements
    text = re.sub(r"(?:\n|^)(\s*\*|\-|\d+\.)\s+(.*?)$", "<md-list v=\"\\1\">\\2</md-list>", text, re.MULTILINE)
    # we replace strong, italicized and strong italicized text
    text = re.sub(r"(?:(?![\\])\*){3}([^\*\n]+)(?:(?![\\])\*){3}", "<md-strong-it>\\1</md-strong-it>", text)
    text = re.sub(r"(?:(?![\\])\*){2}([^\*\n]+)(?:(?![\\])\*){2}", "<md-strong>\\1</md-strong>", text)
    text = re.sub(r"(?:(?![\\])\*){1}([^\*\n]+)(?:(?![\\])\*){1}", "<md-it>\\1</md-it>", text)

    # we replace Markdown links
    text = re.sub(r"(?!\\)\[([^\]]+?)(?!\\)\](?!\\)\(([^\)]+?)(?!\\)\)",serialize_md_link
        , text)
    text = re.sub(r"(?!\\)\[([^\]]+?)(?!\\)\]",
        serialize_md_link, text)

    return text