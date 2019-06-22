# Name of the problem: Resto da Divisão
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1133

X = int(input())
Y = int(input())
if(X > Y):
    for number_between in range (Y+1, X):
        if(number_between % 5 == 2 or number_between % 5 == 3):
            print(number_between)

else:
    for number_between in range (X+1, Y):
        if(number_between % 5 == 2 or number_between % 5 == 3):
            print(number_between)



