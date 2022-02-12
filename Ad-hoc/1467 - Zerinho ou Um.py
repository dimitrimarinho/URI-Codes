# Name of the problem: Zerinho ou Um
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1467

while True:
    try:
        A, B, C = list(map(str,input().split()))
        if(A != B and A != C):
            print("A")
        elif(B != A and B != C):
            print("B")
        elif(C != A and C != B):
            print("C")
        else:
            print("*")
    except EOFError:
        break

# Submission Accepted on the Beecrowd ! 