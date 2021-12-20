# Name of the problem: Área Direita
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1190

word = input()
sum = average = n = 0
diag1 = 0
diag2 = 11
for line in range(12):
    for column in range(12):
        number = float(input())
        if(column > diag2 and column > diag1):
            sum += number
            n += 1
    diag2 -= 1
    diag1 += 1

average = sum/n
if(word == 'S'):
    print('{:.1f}'.format(sum))
elif(word == "M"):
    print('{:.1f}'.format(average))

# Submission Accepted on the Beecrowd ! 