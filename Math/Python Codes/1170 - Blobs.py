# Name of the problem: Blobs
# Link: https://www.beecrowd.com.br/judge/pt/problems/view/1170
def days_to_1kg(C):
    days = 0
    while(C > 1):
        C = C/2
        days += 1
    print(days, end = " ")
    print("dias")

N = int(input())
for i in range(N):
    C = float(input())
    days_to_1kg(C)
 
# Submission Accepted on the Beecrowd ! 