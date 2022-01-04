# Name of the problem: Abaixo da Diagonal Principal
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1184

O = str(input())
matriz = []

for linha in range(12):
    linha = []
    for coluna in range(12):
        elem = float(input())
        linha.append(elem)
    matriz.append(linha)

quant = 0
Sum = 0
for linha in range(12):
    for coluna in range(12):
        if(coluna < linha):
            quant += 1
            Sum += matriz[linha][coluna]

if(O == 'S'):
    print('{0:.1f}'.format(Sum))
elif(O == 'M'):
    print('{0:.1f}'.format(Sum/quant))