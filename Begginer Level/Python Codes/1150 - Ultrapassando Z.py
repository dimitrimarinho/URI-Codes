# Name of the problem: Ultrapassando Z
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1150

X = int(input())
Z = int(input())

while Z <= X:
    Z = int(input())

sum = aux = X
count = 1
while sum <= Z:
    sum += (aux+1)
    aux += 1
    count += 1

print(count)