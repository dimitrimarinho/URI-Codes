// Name of the problem: Maior e Posição
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1080

#include<iostream>
using namespace std;
int main(){

	int vet[100], num, maior, pos;
	maior = 0;
	pos = 0;
	for (int i = 0; i < 100; i++){
		cin >> num;
		vet[i] = num;
		if(vet[i] > maior){
				maior = vet[i];
				pos = i+1;
		}
	}

	cout << maior << endl << pos << endl;

}
