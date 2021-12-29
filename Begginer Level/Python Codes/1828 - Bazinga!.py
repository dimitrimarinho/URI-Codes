# Name of the problem: Bazinga!
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1828

T = int(input())
for i in range(T):
    line = input().split(" ")
    if(line[0] == line[1]):
        print('Caso #{}: De novo!'.format(i+1))
    elif(line[0] == 'tesoura' and line[1] == 'papel'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'papel' and line[1] == 'pedra'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'pedra' and line[1] == 'lagarto'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'lagarto' and line[1] == 'Spock'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'Spock' and line[1] == 'tesoura'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'tesoura' and line[1] == 'lagarto'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'lagarto' and line[1] == 'papel'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'papel' and line[1] == 'Spock'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'Spock' and line[1] == 'pedra'):
        print('Caso #{}: Bazinga!'.format(i+1))
    elif(line[0] == 'pedra' and line[1] == 'tesoura'):
        print('Caso #{}: Bazinga!'.format(i+1))
    else:
        print('Caso #{}: Raj trapaceou!'.format(i+1))

# Submission Accepted on the Beecrowd ! 