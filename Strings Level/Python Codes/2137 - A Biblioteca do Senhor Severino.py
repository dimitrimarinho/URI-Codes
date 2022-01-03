# Name of the problem: A Biblioteca do Senhor Severino
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/2137

while True:
    try:
        N = int(input())
        lib = []
        for i in range(N):
          book = input()
          lib.append(book)
        lib.sort()
        print('\n'.join(lib))
    except EOFError:
        break

# Submission Accepted on the Beecrowd ! 