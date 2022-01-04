// Name of the problem: Números Ímpares
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1067

#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	for (int i=1; i <= n; i++){
		if (i%2!=0)
			cout << i << endl;
	}
}

