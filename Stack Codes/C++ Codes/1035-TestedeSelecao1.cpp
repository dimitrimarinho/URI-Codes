// Name of the problem: Teste de Seleção 1
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1035

#include<iostream>
using namespace std;
int main(){

	int A,B,C,D;
	cin >> A >> B >> C >> D;
	if (B > C && D > A && (C+D) > (A+B) && C >= 0 && D >= 0 && A%2 == 0)
		cout << "Valores aceitos" << endl;
	else 
		cout << "Valores nao aceitos" << endl;

}
