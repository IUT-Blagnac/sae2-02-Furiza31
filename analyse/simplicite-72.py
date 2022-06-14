# return string without spaces
def erase(str):
    res = ""
    i = 0
    while (i < len(str)) :
        if (str[i] != ' ' or (str[i + 1] == ' ' or str[i - 1] == ' ')) :
            res += str[i]
        i += 1
    return res
