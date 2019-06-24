// Name of the problem: Gasto de Combustível
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017

#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int tempo, velocidade;
	cin >> tempo >> velocidade;
	float distanciakm = tempo * velocidade;
	cout << fixed << setprecision(3) << distanciakm/12 << endl;
}
