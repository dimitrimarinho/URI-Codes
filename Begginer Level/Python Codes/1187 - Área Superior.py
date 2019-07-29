# Name of the problem: Área Superior
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1187

O = str(input())
matriz = []

for line in range(12):
    line = []
    for column in range(12):
        num = float(input())
        line.append(num)
    matriz.append(line)

quant = 0
Sum = 0
for line in range(12):
    for column in range(12):
        if(column > line and (column + line) <= 10):
            quant += 1
            Sum += matriz[line][column]

if(O == 'S'):
    print('{0:.1f}'.format(Sum))
elif(O == 'M'):
    print('{0:.1f}'.format(Sum/quant))


