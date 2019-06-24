# Name of the problem: Sequência S II
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1156

S = 1.0
i = 3
j = 2
while True:
    S += i/j
    i += 2
    j *= 2
    if(i > 39):
        break
print('{0:.2f}'.format(S))