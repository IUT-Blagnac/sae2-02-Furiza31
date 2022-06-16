import timeit
from code_a_analyser import efficacite_9
from code_a_analyser import efficacite_25

f = open("analyse/code_a_analyser/text.txt", "r")
start = timeit.default_timer()

for i in range(1000):
    efficacite_9.erase(f.read())

# temp d'éxécution en seconde
print("efficacite_9:",
      (timeit.default_timer() - start), "seconde")

start = timeit.default_timer()

for i in range(1000):
    efficacite_25.erase(f.read())

# temp d'éxécution en seconde
print("efficacite_25:",
      (timeit.default_timer() - start), "secondes")
