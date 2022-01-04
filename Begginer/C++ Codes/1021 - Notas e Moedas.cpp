// Name of the problem: Notas e Moedas
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1021

#include<iostream>
using namespace std;
int main(){

	double money, rest;
	int n100, n50, n20, n10, n5, n2;
	int m1, m050, m025, m010, m005, m001;
	cin >> money;

	// Cálculo da quantidade de notas
	n100 = money/100;
	rest = money - 100*n100;
	n50 = rest / 50;
	rest = rest - 50*n50;
	n20 = rest / 20;
	rest = rest - 20*n20;
	n10 = rest / 10;
	rest = rest - 10*n10;
	n5 = rest / 5;
	rest = rest - 5*n5;
	n2 = rest / 2;
	rest = rest - 2*n2;

	// Impressão da quantidade de notas
	cout << "NOTAS:\n";
	cout << n100 << " nota(s) de R$ 100.00\n";
	cout << n50 << " nota(s) de R$ 50.00\n";
	cout << n20 << " nota(s) de R$ 20.00\n";
	cout << n10 << " nota(s) de R$ 10.00\n";
	cout << n5 << " nota(s) de R$ 5.00\n";
	cout << n2 << " nota(s) de R$ 2.00\n";

	// Cálculo da quantidade de moedas
	rest = rest * 100;
	m1 = (rest/100);
	rest = rest - 100*m1;
	m050 = (rest / 50);
	rest = rest - 50*m050;
	m025 = (rest / 25);
	rest = rest - 25*m025;
	m010 = (rest / 10);
	rest = rest - 10*m010;
	m005 = (rest / 5);
	rest = rest - 5*m005;
	m001 = (rest / 1);

	// Impressão da quantidade de moedas
	cout << "MOEDAS:\n";
	cout << m1 << " moeda(s) de R$ 1.00\n";
	cout << m050 << " moeda(s) de R$ 0.50\n";
	cout << m025 << " moeda(s) de R$ 0.25\n";
	cout << m010 << " moeda(s) de R$ 0.10\n";
	cout << m005 << " moeda(s) de R$ 0.05\n";
	cout << m001 << " moeda(s) de R$ 0.01\n";

}
