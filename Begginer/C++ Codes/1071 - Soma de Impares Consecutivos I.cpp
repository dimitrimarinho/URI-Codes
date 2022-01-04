// Name of the problem: Soma de Impares Consecutivos I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1071

#include<iostream>
using namespace std;
int main(){
	int X, Y, soma=0;
	cin >> X >> Y;
	if (X > Y){
		int loop = (X-Y)-1;
		for(int i=0; i < loop; i++){
			Y++;
			if(Y%2!=0)
				soma+=Y;
		}
		cout << soma << endl;
	}
	else if (Y > X){
		int loop = (Y-X)-1;
		for(int i=0; i < loop; i++){
			X++;
			if(X%2!=0)
				soma+=X;
		}
		cout << soma << endl;
	}
	else
		cout << "0" << endl;
}

