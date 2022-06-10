def start(req):
    res = ""
    length = len(req)
    if (req[0] == ' ' and req[1] != ' '):
        res += ""
    else:
        res += req[0]

    for i in range(1, length-1):
        if (req[i] == ' ' and req[i+1] != ' ' and req[i-1] != ' '):
            res += ""
        else:
            res += req[i]
    if (req[length - 1] == ' ' and req[length - 2] != ' '):
        res += ""
    else:
        res += req[length - 2]
    return res
