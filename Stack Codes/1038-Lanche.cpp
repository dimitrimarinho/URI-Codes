// Name of the problem: Lanche
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038

#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	cout << fixed << setprecision(2);
	int codigo, quantidade;
	cin >> codigo >> quantidade;
	if (codigo == 1)
		cout << "Total: R$ " << (4.00 * quantidade) << endl;
	else if(codigo == 2)
		cout << "Total: R$ " << (4.50 * quantidade) << endl;
	else if(codigo == 3)
		cout << "Total: R$ " << (5.00 * quantidade) << endl;
	else if(codigo == 4)
		cout << "Total: R$ " << (2.00 * quantidade) << endl;
	else	
		cout << "Total: R$ " << (1.50 * quantidade) << endl;


}
