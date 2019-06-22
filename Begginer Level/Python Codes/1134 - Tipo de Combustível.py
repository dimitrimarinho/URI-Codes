# Name of the problem: Tipo de Combustível
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1134

Alcool = 0
Gasolina = 0
Diesel = 0

while(True):
    tipo = int(input())
    if(tipo == 1):
        Alcool += 1
    elif(tipo == 2):
        Gasolina += 1
    elif(tipo == 3):
        Diesel += 1
    elif(tipo == 4):
        break
print('MUITO OBRIGADO')
print('Alcool: ' + str(Alcool))
print('Gasolina: ' + str(Gasolina))  
print('Diesel: ' + str(Diesel))        

