# Name of the problem: Dividindo X por Y
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1116

N = int(input())
for casos_de_teste in range (0, N):
    linha = str(input())
    X, Y = linha.split(" ")
    X = int(X)
    Y = int(Y)
    if(Y == 0):
        print('divisao impossivel')
    else:
        print(str(X/Y))