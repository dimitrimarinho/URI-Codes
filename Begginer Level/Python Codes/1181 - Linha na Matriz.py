# Name of the problem: Linha na Matriz
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1181

L = int(input())
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
    for coluna in range (12):
        if(linha == L):
            Sum += matriz[linha][coluna]  

if(T == 'S'):
    print(str(Sum))
elif(T == 'M'):
    print(str(Sum/12))