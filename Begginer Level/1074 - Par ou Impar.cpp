// Name of the problem: Par ou Ímpar
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1074

#include<iostream>
using namespace std;
int main(){
	int cont, n;
	cin >> cont;
	for(int i=0; i<cont; i++){
		cin >> n;
		if(n==0){
			cout << "NULL\n";
		}
		else if(n%2!=0){
			if(n>0)
				cout << "ODD POSITIVE\n";
			else
				cout << "ODD NEGATIVE\n";
		}
		else if(n%2==0){
			if(n>0)
				cout << "EVEN POSITIVE\n";
			else
				cout << "EVEN NEGATIVE\n";
		}
	}
}

