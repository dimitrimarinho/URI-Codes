# Name of the problem: Número Perfeito
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1164

N = int(input())
for sequencia in range(N):
    SumPerfect = 0
    X = int(input())
    for divisor in range(1, X):
        if(X % divisor == 0):
            SumPerfect += divisor
    if(SumPerfect == X):
        print(str(X)+' eh perfeito')
    else:
        print(str(X)+' nao eh perfeito')