// Name of the problem: Fórmula de Bhaskara
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1036

#include<iostream>
#include<iomanip>
#include<math.h>
using namespace std;
int main(){
	double A, B, C, R1, R2;
	cin >> A >> B >> C;
	cout << fixed << setprecision(5);
	if( ((pow(B,2) - 4*A*C) < 0) || A == 0 )
		cout << "Impossivel calcular" << endl;
	else{
		R1 = ((-B) + sqrt(pow(B,2) - 4*A*C))/(2*A);
		R2 = ((-B) - sqrt(pow(B,2) - 4*A*C))/(2*A); 
		cout << "R1 = " << R1 << endl;
		cout << "R2 = " << R2 << endl;
	}
}
