# Name of the problem: Fuso Horário
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/2057

S, T, F = map(int,input().split())
sum = S + T + F
if(sum > 24):
    sum = sum - 24
elif(sum < 0):
    sum = 24 + sum    
print(sum)
