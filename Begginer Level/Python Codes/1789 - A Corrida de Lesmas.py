# Name of the problem: A Corrida de Lesmas
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1789

while True:
    try:
        L = int(input())
        vetVi = input().split()
        level = 1
        for i in range(L):
            if(int(vetVi[i]) > 10 and int(vetVi[i]) < 20):
                level = 2
            elif(int(vetVi[i]) >= 20):
                level = 3
                break
        print(level)
    except EOFError:
        break

# Submission Accepted on the Beecrowd ! 