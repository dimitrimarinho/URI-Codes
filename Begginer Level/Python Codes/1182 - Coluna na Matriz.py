# Name of the problem: Coluna na Matriz
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1182

C = int(input())
T = str(input())
matriz = []
Sum = 0

for linha in range (12):
    linha = []
    for coluna in range (12):
        elemento = float(input())
        linha.append(elemento)
    matriz.append(linha)

for linha in range (12):
    Sum += matriz[linha][C]  

if(T == 'S'):
    print('{0:.1f}'.format(Sum))
elif(T == 'M'):
    print('{0:.1f}'.format(Sum/12))