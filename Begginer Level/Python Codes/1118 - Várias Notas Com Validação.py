# Name of the problem: Várias Notas Com Validação
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1118

num1 = -1.0
num2 = -1.0
nvcal = 1
while True:
    num = float(input())
    if (num >= 0 and num <= 10) :
        if (num1 == -1) :
            num1 = num
        else:
            num2 = num
    else:
        print('nota invalida')
    if (num1 != -1 and num2 != -1) :
        media = (num1+num2)/2
        print('media = {0:.2f}'.format(media))
        print('novo calculo (1-sim 2-nao)')
        num1 = -1
        num2 = -1
        nvcal = int(input())
    while(nvcal < 1 or nvcal > 2):
        print('novo calculo (1-sim 2-nao)')
        nvcal = int(input())
    if nvcal == 2 :
        break