# Name of the problem: Um-Dois-Três
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1332

n_words = int(input())
for i in range(n_words):
    word = input()
    if(len(word) == 3):
        if((word[0] == 'o' and word[1] == 'n') or (word[0] == 'o' and word[2] == 'e') or (word[1] == 'n' and word[2] == 'e')):
            print(1)
        else:
            print(2)
    elif(len(word) == 5):
        print(3)
    
# Submission Accepted on the Beecrowd ! 