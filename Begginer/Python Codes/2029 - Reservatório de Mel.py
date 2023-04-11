# Name of the problem: Reservatório de Mel
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/2029

while True:

    try:

        V, D = float(input()), float(input())
        AREA = (3.14 * (D/2)**2)
        ALTURA = V / AREA
        print(f'ALTURA = {ALTURA:.2f}')
        print(f'AREA = {AREA:.2f}')
        
    except EOFError:
        break