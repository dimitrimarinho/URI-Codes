# Name of the problem: Preenchimento de Vetor II
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1177

T = int(input())
fill = 0
for Ni in range (0, 1000):
    print('N[' + str(Ni) + '] = ' + str(fill))
    if(fill < T-1):
        fill += 1
    else:
        fill = 0
