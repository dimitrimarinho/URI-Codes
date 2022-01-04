// Name of the problem: Resto 2
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1075

#include<iostream>
using namespace std;
int main(){

	int N;
	cin >> N;

	for(int i = 1; i <= 10000; i++){
		if(i%N == 2)
			cout << i << endl;
	}

}
