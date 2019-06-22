# Name of the problem: Validação de Nota
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1117

two_valid = False
x1 = -1
x2 = -1
while (two_valid == False):
    if(x1 != -1 and x2 != -1):
        two_valid = True
    elif(x1 == -1):
        x1 = float(input())
        if(x1 < 0 or x1 > 10):
            print('nota invalida')
            x1 = -1
    elif (x1 != -1):
        if(x2 == -1):
            x2 = float(input())
        if(x2 < 0 or x2 > 10):
            print('nota invalida')
            x2 = -1
print('media = {0:.2f}'.format((x1+x2)/2))
