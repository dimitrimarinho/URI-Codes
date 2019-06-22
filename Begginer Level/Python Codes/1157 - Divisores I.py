# Name of the problem: Divisores
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1157

N = int(input())
for divisor in range(1, N+1):
    if(N % divisor == 0):
        print(divisor)