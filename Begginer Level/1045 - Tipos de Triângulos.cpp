// Name of the problem: Tipos de Triângulos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1045

#include<iostream>
#include<algorithm> // biblioteca do sort
using namespace std;
int main(){

	double number, A, B ,C;
	double ord[3];
	for(int i = 0; i < 3; i++){
		cin >> number;
		ord[i] = number;
	}
	sort(ord, ord+3);
	A = ord[2];
	B = ord[1];
	C = ord[0];

	if (A >= B+C)
		cout << "NAO FORMA TRIANGULO\n";
	else{
		if ((A*A) == ((B*B) + (C*C)))
			cout << "TRIANGULO RETANGULO\n";
		else if ((A*A) > ((B*B) + (C*C)))
			cout << "TRIANGULO OBTUSANGULO\n";
		else if ((A*A) < ((B*B) + (C*C)))
			cout << "TRIANGULO ACUTANGULO\n";
		if (A == B && A == C)
			cout << "TRIANGULO EQUILATERO\n";
		else if (A == B || A == C || B == C)
			cout << "TRIANGULO ISOSCELES\n";
	}

}
