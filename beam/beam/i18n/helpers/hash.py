import hashlib

def hash(text):
    return hashlib.sha256(text.encode("utf-8")).hexdigest()[:16]
