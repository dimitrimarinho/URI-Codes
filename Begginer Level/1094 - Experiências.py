# Name of the problem: Experiências
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1094

N = int(input())
Cobaias = 0
Coelhos = 0
Ratos = 0 
Sapos = 0

for N in range(0, N):
    Quantia_Tipo = str(input())
    Quantia, Tipo = Quantia_Tipo.split(" ")
    Quantia = int(Quantia)
    if(Tipo == "C"):
        Coelhos += Quantia
    elif(Tipo == "R"):
        Ratos += Quantia
    elif(Tipo == "S"):
        Sapos += Quantia
    Cobaias += Quantia

Pcoelhos = Coelhos/Cobaias * 100
Pratos = Ratos/Cobaias * 100
Psapos = Sapos/Cobaias * 100

print('Total: ' + str(Cobaias) + ' cobaias')
print('Total de coelhos: ' + str(Coelhos))
print('Total de ratos: ' + str(Ratos))
print('Total de sapos: ' + str(Sapos))              
print('Percentual de coelhos: {0:.2f} %'.format(Pcoelhos))                
print('Percentual de ratos: {0:.2f} %'.format(Pratos))               
print('Percentual de sapos: {0:.2f} %'.format(Psapos))                 