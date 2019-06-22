# Name of the problem: Soma de Ímpares Consecutivos II
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1099

N = int(input())
for casos_de_teste in range(0, N):
    Sum = 0
    linha = str(input())
    X, Y = linha.split(" ")
    X = int(X)
    Y = int(Y)
    if(X == Y):
        Sum = 0
    elif(X > Y):
        Y += 1
        for sequencia in range(Y, X):
            if(Y % 2 == 1):
                Sum += Y
            Y += 1
    elif(Y > X):
        X += 1
        for sequencia in range(X, Y):
            if(X % 2 == 1):
                Sum += X
            X += 1
    print(str(Sum))
