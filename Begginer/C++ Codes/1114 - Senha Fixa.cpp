// Name of the problem: Senha Fixa
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1114

#include<iostream>
using namespace std;
int main(){

	int attempt;
	cin >> attempt;
	while (attempt != 2002){
		cout << "Senha Invalida\n";
		cin >> attempt;
	}
	cout << "Acesso Permitido\n";

}
