import re


def start(req):
    return re.sub("(?<! ) (?! )", "", req)
