# Name of the problem: Cifra de César
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1253

N = int(input())
for i in range(N):
    codif = str(input())
    tam = len(codif)
    decodificado = ''
    des = int(input())
    for j in range(tam):
        num = ord(codif[j])
        if(num - des >= ord('A')):
            decodificado += chr(num - des)
        else:
            aux = des
            temp = num - ord('A')
            des -= temp
            decodificado += chr(ord('Z') - (des-1))
            des = aux
    print(decodificado)