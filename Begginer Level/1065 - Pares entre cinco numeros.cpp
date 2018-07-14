// Name of the problem: Pares entre Cinco Números
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1065

#include<iostream>
using namespace std;
int main(){
	int n, pares=0;
	for (int i=1; i <= 5; i++){
		cin >> n;
		if (n%2==0)
			pares++;
	}
	cout << pares << " valores pares" << endl;
}

