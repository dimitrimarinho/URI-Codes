# Name of the problem: Construindo Casas
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1541
import math

line = input().split(" ")
A = int(line[0])
B = int(line[1])
C = int(line[2])

while(A != 0):
    size = ((A*B) * 100/C) ** 0.5
    print(math.floor(size))

    line = input().split(" ")
    if(len(line) > 1):
        A = int(line[0])
        B = int(line[1])
        C = int(line[2])
    else:
        A = int(line[0])

# Submission Accepted on the Beecrowd ! 