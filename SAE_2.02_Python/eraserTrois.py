from copy import copy
from ntpath import join


def start(req):
    res = list(req)
    i = 1
    test = True
    if (res[0] == ' ' and res[1] != ' '):
        del res[0]

    while (test):
        if (i >= len(res)-1):
            break
        if (res[i] == ' ' and res[i+1] != ' ' and res[i-1] != ' '):
            del res[i]
        i += 1

    if res[len(res)-1] == ' ' and res[len(res)-2] != ' ':
        del res[len(res)-1]
    return ''.join(res)
