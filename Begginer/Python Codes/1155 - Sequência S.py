# Name of the problem: Sequência S
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1155

S = 0.0
for i in range(1,101):
    S += 1/i
print('{0:.2f}'.format(S))
