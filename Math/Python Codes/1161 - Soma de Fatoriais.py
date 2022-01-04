# Name of the problem: Soma de Fatoriais
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1161
import math

while True:
    try:
        line = input().split(" ")
        M = int(line[0])
        N = int(line[1])
        print(math.factorial(M) + math.factorial(N))
    except EOFError:
        break
 
# Submission Accepted on the Beecrowd ! 