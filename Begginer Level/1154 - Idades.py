# Name of the problem: Idades
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1154

quant = 0
Sum = 0
idade = int(input())
while(idade >= 0):
    Sum += idade
    quant += 1
    idade = int(input())
print('{0:.2f}'.format(Sum/quant))



