// Name of the problem: PUM
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1142

#include<iostream>
using namespace std;
int main(){

	int N, n1 = 1, n2 = 2, n3 = 3;
	cin >> N;
	for(int i = 0; i < N; i++){
		cout << n1 << " " << n2 << " " << n3 << " PUM" << endl;
		n1+=4;
		n2+=4;
		n3+=4;
	}

}
