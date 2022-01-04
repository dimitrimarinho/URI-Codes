# Name of the problem: Número Primo
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1165

N = int(input())
for isPrime in range(N):
    number = int(input())
    quant_divisor = 0
    for divisor in range(1, number+1):
        if(number % divisor == 0):
            quant_divisor += 1
        if(quant_divisor > 2):
            print(str(number) + ' nao eh primo')
            break
    if(quant_divisor == 2):
        print(str(number) + ' eh primo')
