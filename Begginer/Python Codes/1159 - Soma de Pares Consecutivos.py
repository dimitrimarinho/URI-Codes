# Name of the problem: Soma de Pares Consecutivos
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1159

X = int(input())
while (X != 0) :
    if(X % 2 == 1):
        X = X + 1
    soma = 0
    for i in range(0, 10, 2) :
        consec = X + i
        soma += consec
    print(soma)
    X = int(input())
