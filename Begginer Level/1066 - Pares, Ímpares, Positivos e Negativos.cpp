// Name of the problem: Pares, Ímpares, Positivos e Negativos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1066

#include<iostream>
using namespace std;
int main(){

	int values[5], pairs = 0, odd = 0, positive = 0, negative = 0;

	// Leitura dos valores no vetor
	for(int i = 0; i <= 4; i++)
		cin >> values[i];

	// Verificando as propriedades do valor
	for(int i = 0; i <= 4; i++){
		if(values[i]%2 == 0)
			pairs++;
		else
			odd++;
		if(values[i] > 0)
			positive++;
		else if(values[i] < 0)
			negative++;
	}

	// Imprimindo os resultados
	cout << pairs << " valor(es) par(es)\n";
	cout << odd << " valor(es) impar(es)\n";
	cout << positive << " valor(es) positivo(s)\n";
	cout << negative << " valor(es) negativo(s)\n";

}
