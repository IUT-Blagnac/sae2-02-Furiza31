import string
import random

s = ""
for i in range(1000000):
    s += random.choice(string.ascii_letters+"     ")
f = open("analyse/code_a_analyser/text.txt", "a")
f.write(s)
f.close()
