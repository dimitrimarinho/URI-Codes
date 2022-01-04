# Name of the problem: Sequencia IJ 4
# Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1098

from decimal import Decimal

soma = Decimal('0.2')
i = Decimal('0')

while i <= 2:
        for j in range (1,4):
                if int(i) == float(i):
                        print('I={} J={}'.format(int(i), j+int(i)))
                else:
                        print('I={} J={}'.format(i, j+i))
        i+=soma