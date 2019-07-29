T = int(input())
for n_cases in range(T):
    PA, PB, G1, G2 = map(float, input().split())
    PA = int(PA)
    PB = int(PB)
    years = 0
    while(PA <= PB):        
        PA += int(PA * (G1 / 100) ) 
        PB += int(PB * (G2 / 100) ) 
        years += 1
        if(years > 100):
            print('Mais de 1 seculo.')
            break
    if(years <= 100):
        print('{} anos.'.format(years))
