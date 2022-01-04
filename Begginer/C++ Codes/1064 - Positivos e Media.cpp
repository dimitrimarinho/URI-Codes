// Name of the problem: Positivos e Média
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1064

#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	cout << fixed << setprecision(1);
	float n, soma=0;
	int positivos=0;
	for (int i=1; i <= 6; i++){
		cin >> n;
		if (n > 0){
			positivos++;
			soma+= n;
		}
	}
	cout << positivos << " valores positivos" << endl;
	float media;
	media=soma/positivos;
	cout << media << endl;
}

