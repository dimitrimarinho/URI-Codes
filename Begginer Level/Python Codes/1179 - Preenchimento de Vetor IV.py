# Name of the problem: Preenchimento de Vetor IV
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1179

par = []
impar = []

for i in range(15):
    val = int(input())
    if val % 2 == 0:
        par.append(val)
    else:
        impar.append(val)
    if(len(par) == 5):
        for v_print in range(5):
            print('par[{}] = {}'.format(v_print, par[v_print]))
        par.clear()        
    if(len(impar) == 5):
        for v_print in range(5):
            print('impar[{}] = {}'.format(v_print, impar[v_print]))
        impar.clear()

for v_print in range(len(impar)):
    print('impar[{}] = {}'.format(v_print, impar[v_print]))
for v_print in range(len(par)):
    print('par[{}] = {}'.format(v_print, par[v_print]))