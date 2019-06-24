# Name of the problem: Grenais
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1131

Tjogos = 0
Vinter = 0
Vgremio = 0
Empates = 0

while True:
    gols = str(input())
    Inter, Gremio = gols.split(" ")
    Inter = int(Inter)
    Gremio = int(Gremio)

    if Inter > Gremio:
        Vinter += 1
    elif Gremio > Inter:
        Vgremio += 1
    else:
        Empates += 1
    Tjogos += 1
    print('Novo grenal (1-sim 2-nao)')
    ans = int(input())
    if(ans != 1):
        break

print('{} grenais'.format(Tjogos))
print('Inter:{}'.format(Vinter))
print('Gremio:{}'.format(Vgremio))
print('Empates:{}'.format(Empates))
if Vinter > Vgremio :
    print('Inter venceu mais')
elif Vgremio > Vinter :
    print('Gremio venceu mais')
else:
    print('Nao houve vencedor')






