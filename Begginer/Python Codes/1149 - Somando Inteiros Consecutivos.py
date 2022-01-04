# Name of the problem: Somando Inteiros Consecutivos
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1149

A_N = str(input())
line = A_N.split(" ")
A = int(line[0])
N = int(line[len(line)-1])

soma = 0
consec = A
for add in range(N):
    consec = A + add
    soma += consec
print(soma)