# Name of the problem: Fibonacci em Vetor
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1176

T = int(input())
fibonacci = [0, 1]

for numbers_T in range(T):
    fibo = int(input())
    if(len(fibonacci)-1 >= fibo):
        print('Fib('+str(fibo)+') = '+str(fibonacci[fibo]))
    else:
        fib_ant2 = fibonacci[len(fibonacci) - 2]
        fib_ant1 = fibonacci[len(fibonacci) - 1]
        for fill_fibo in range(len(fibonacci) - 1, fibo):        
            fib_atual = fib_ant1 + fib_ant2
            fibonacci.append(fib_atual)
            fib_ant2 = fib_ant1
            fib_ant1 = fib_atual
        print('Fib('+str(fibo)+') = '+str(fibonacci[fibo]))