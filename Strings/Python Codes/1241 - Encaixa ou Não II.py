# Name of the problem: Encaixa ou Não II
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1241

N = int(input())
for i in range(N):
    A, B = list(map(str,input().split()))
    if A[-len(B):] == B:  
        print("encaixa")
    else:
        print("nao encaixa") 

# Submission Accepted on the Beecrowd ! 