# Name of the problem: Sequência de Números e Soma
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1101

while True:
    try:
        M_N = str(input())
        M, N = M_N.split(" ")
        M = int(M)
        N = int(N)
        Sum = 0
        if(M <= 0 or N <= 0):
            break

        if(N > M):
            Begin = M
            for sequencia in range(Begin, N+1):
                Sum += M
                print(str(M) + ' ', end="")
                M += 1
        else:
            Begin = N
            for sequencia in range(Begin, M+1):
                Sum += N
                print(str(N) + ' ', end="")
                N += 1
        print('Sum=' + str(Sum))        
    except EOFError:
        break