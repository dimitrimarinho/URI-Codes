# Name of the problem: Soma de Ímpares Consecutivos III
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158

N = int(input())
for i in range(N) :
    X_Y = str(input())
    X, Y = X_Y.split(" ")
    X = int(X)
    Y = int(Y)
    if(X % 2 == 0):
        X += 1
    soma = 0
    dist = (Y-1)*2 + 1
    for add in range(0, dist, 2):
        consec = X + add
        soma += consec
    print(soma)
