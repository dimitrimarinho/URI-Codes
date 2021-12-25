# Name of the problem: Prefácio
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1837
import math

line = input().split(" ")
a = int(line[0])
b = int(line[1])

if(b > 0):
    q = math.floor(a/b)
else:
    q = math.ceil(a/b)
r = a - (b*q)

print(q,r)

# Submission Accepted on the Beecrowd ! 