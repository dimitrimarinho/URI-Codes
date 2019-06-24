// Name of the problem: Substituição em Vetor I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1172

#include<iostream>
using namespace std;
int main(){

	int vetX[10];

	for (int i = 0; i < 10; i++){
		cin >> vetX[i];
		if(vetX[i] <= 0)
			vetX[i] = 1;
	}

	for (int i = 0; i < 10; i++){
		cout << "X[" << i << "] = " << vetX[i] << endl;
	}

}
