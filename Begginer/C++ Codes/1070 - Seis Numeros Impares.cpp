// Name of the problem: Seis Números Ímpares
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1070

#include<iostream>
using namespace std;
int main(){
	int n, impares = 0;
	cin >> n;
	while(impares < 6){
		if (n%2!=0){
			cout << n << endl;
			impares++;
		}
		n++;
	}
}

