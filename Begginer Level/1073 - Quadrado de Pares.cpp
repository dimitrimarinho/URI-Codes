// Name of the problem: Quadrado de Pares
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1073

#include<iostream>
using namespace std;
int main(){

	long int N;
	cin >> N;
	for (int i = 2; i <= N; i+=2)
			cout << i << "^2 = " << i*i << endl;

}
