# Name of the problem: Sentença Dançante
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1234

while True:
    try:
        line = list(input())
        aux = 1
        for i in range(len(line)):
            if(line[i] != ' '):
                if(aux % 2 == 1 and line[i].islower() == True):
                    line[i] = line[i].upper()
                    aux += 1                    
                elif(aux % 2 == 0 and line[i].isupper() == True):
                    line[i] = line[i].lower()
                    aux += 1
                else:
                    aux += 1               
        print(''.join(line))
    except EOFError:
        break

# Submission Accepted on the Beecrowd ! 