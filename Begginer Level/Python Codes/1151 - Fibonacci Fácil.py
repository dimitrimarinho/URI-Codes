# Name of the problem: Fibonacci Fácil
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1151

N = int(input())
f0 = 0
f1 = 1
print(str(f0) + " " + str(f1) + " ", end = "")
for Fibonacci in range (2, N):
    aux = f0
    f0 = f1
    f1 = aux + f1
    if(Fibonacci != N-1):
        print(str(f1) + " ", end = "")
    else:
        print(str(f1))

