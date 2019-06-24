# Name of the problem: LED
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1168

N = int(input())
for i in range (N):
    value = str(input())
    leds = 0
    for pos in range (len(value)):
        if(value[pos] == '1'):
            leds += 2
        elif(value[pos] == '7'):
            leds += 3
        elif(value[pos] == '4'):
            leds += 4
        elif(value[pos] == '2' or value[pos] == '3' or value[pos] == '5'):
            leds += 5
        elif(value[pos] == '0' or value[pos] == '6' or value[pos] == '9'):
            leds += 6
        elif(value[pos] == '8'):
            leds += 7
    print('{} leds'.format(leds))