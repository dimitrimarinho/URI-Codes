# Name of the problem: Combinador
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1238

N = int(input())
for i in range(N):
    Str1, Str2 = input().split(" ")
    len1 = len(Str1)
    len2 = len(Str2)
    finalWord = []
    j = 0
    while(j < (len1+len2)):
        if(j < len1):
            finalWord.append(Str1[j])
        if(j < len2):
            finalWord.append(Str2[j])
        j += 1
    print(''.join(finalWord))

# Submission Accepted on the Beecrowd ! 