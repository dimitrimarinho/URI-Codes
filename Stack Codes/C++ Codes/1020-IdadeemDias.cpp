// Name of the problem: Idade em Dias
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1020

#include<iostream>
using namespace std;
int main(){
	int dias, ano, mes, dia;
	cin >> dias;
	ano = dias/365;
	mes = (dias - (365*ano))/30;
	dia = dias - ((ano*365) + (mes*30));
	cout << ano << " ano(s)\n";
	cout << mes << " mes(es)\n";
	cout << dia << " dia(s)\n"; 	
}
