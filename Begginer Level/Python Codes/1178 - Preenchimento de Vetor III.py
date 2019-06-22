# Name of the problem: Preenchimento de Vetor III
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1178

X = float(input())
for posicao in range (0, 100):
    print('N[' + str(posicao) + '] = {0:.4f}'.format(X))
    X = X/2

