# Name of the problem: Múltiplos de 13
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1132

X = int(input())
Y = int(input())
Sum = 0

if(X < Y):
    for not_13_multiple in range (X, Y+1):
        if(not_13_multiple % 13 != 0):
            Sum += not_13_multiple
else:
    for not_13_multiple in range (Y, X+1):
        if(not_13_multiple % 13 != 0):
            Sum += not_13_multiple

print(Sum)

