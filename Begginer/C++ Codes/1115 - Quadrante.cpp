// Name of the problem: Quadrante
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1115

// OBSERVAÇÃO: FALHA GRAVE - A RESOLUÇÃO DO EXEMPLO DO PROBLEMA PROPOSTO CALCULA DE FORMA ERRÔNEA OS QUADRANTES

#include<iostream>
using namespace std;
int main(){

	int x, y;
	cin >> x >> y;
	while(x!= 0 && y!= 0){
		if(x>0 && y>0)
			cout << "primeiro\n";
		else if(x>0 && y<0)
			cout << "quarto\n";
		else if(x<0 && y<0)
			cout << "terceiro\n";
		else if(x<0 && y>0)
			cout << "segundo\n";
		cin >> x >> y;
	}

}
