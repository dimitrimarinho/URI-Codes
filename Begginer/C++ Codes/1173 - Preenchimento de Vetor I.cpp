// Name of the problem: Preenchimento de Vetor I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1173

#include<iostream>
using namespace std;
int main(){

	int n, v[10];
	cin >> n;
	v[0] = n;
	cout << "N[0] = " << n << endl;
	for (int i = 1; i < 10; i++){
		v[i] = 2 * v[i-1];
		cout << "N[" << i << "] = " << v[i] << endl;
	}

}
