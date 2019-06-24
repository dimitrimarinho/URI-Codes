# Name of the problem: Sequências Crescentes
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1146

X = int(input())
while(X != 0):
    for SeqCresc in range(1, X+1):
        if(SeqCresc != X):
            print(str(SeqCresc), end=" ")
        else:
            print(str(SeqCresc))
    X = int(input())