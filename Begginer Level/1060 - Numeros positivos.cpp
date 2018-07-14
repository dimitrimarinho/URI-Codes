// Name of the problem: Números Positivos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1060

#include<iostream>
using namespace std;
int main(){
	double n1;
	int positivo = 0;
	for (int i=0; i < 6; i++){
		cin >> n1;
		if (n1 > 0)
			positivo++;
	}
	cout << positivo << " valores positivos" << endl;	
}
