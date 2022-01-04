# Name of the problem: A Resposta de Theon
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1858

N = int(input())
line = input().split(" ")

min = line[0]
out = 1
for i in range(N):
    if(line[i] < min):
        min = line[i]
        out = i + 1

print(out)

# Submission Accepted on the Beecrowd ! 