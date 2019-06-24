// Name of the problem: Conversão de Tempo
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1019

#include<iostream>
using namespace std;
int main(){
	int N, segundos, horas, minutos;
	cin >> N;
	horas = N/3600;
	minutos = (N/60)-(horas*60);
	segundos = N - ((horas*3600) + (minutos*60));
	cout << horas << ":" << minutos << ":" << segundos << endl;
	

	
}
