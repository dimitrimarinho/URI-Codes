# Name of the problem: Criptografia
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1024

N = int(input())
for i in range(N):
    M = list(input())
    for pos in range(len(M)):
        carac = ord(M[pos])
        if((carac >= 65 and carac <= 90) or (carac >= 97 and carac <= 122)):
            M[pos] = chr(carac + 3)
    M.reverse()
    middle = int((len(M)/2))
    for pos in range(len(M)):
        if(pos >= middle):
            carac = ord(M[pos])
            M[pos] = chr(carac - 1)
    print(''.join(M))
 
# Submission Accepted on the Beecrowd ! 