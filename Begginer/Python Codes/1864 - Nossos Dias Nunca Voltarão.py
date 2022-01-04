# Name of the problem: Nossos Dias Nunca Voltarão
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1864

N = int(input())
quote = "LIFE IS NOT A PROBLEM TO BE SOLVED"

for i in range(len(quote)):
    if(i < N):
        print(quote[i], end="")
    else:
        break
print()

# Submission Accepted on the Beecrowd ! 



