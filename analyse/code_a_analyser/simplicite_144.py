# return string without spaces
def erase(cc):
    str = ""
    taille = len(cc)
    for i in range(taille):
        if cc[i] == chr(32) and cc[min(i+1,taille-2)]!= chr(32) and cc[max(i-1,1)]!= chr(32):
            pass
        else:
            str += cc[i]
    return str
