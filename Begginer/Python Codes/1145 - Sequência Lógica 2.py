# Name of the problem: Sequência Lógica 2
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1145

X_Y = str(input())
X, Y = X_Y.split(" ")
X = int(X)
Y = int(Y)
count = 0

for sequencia in range(1, Y+1):
    count += 1
    if(count != X):
        if(sequencia != Y):
            print(str(sequencia), end = " ")
        else:
            print(str(sequencia))
    else:
        print(str(sequencia))
        count = 0 