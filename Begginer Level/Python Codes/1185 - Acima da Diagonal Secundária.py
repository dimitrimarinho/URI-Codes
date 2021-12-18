# Name of the problem: Acima da Diagonal Secundária
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1185

word = input()
sum = average = n = 0
sub = 11
for line in range(12):
    for column in range(12):
        number = float(input())
        if(column < sub):
            sum += number
            n += 1
    sub -= 1

average = sum/n
if(word == 'S'):
    print('{:.1f}'.format(sum))
elif(word == "M"):
    print('{:.1f}'.format(average))