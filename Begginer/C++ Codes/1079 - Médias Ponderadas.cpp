// Name of the problem: Médias Ponderadas
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1079

#include<iostream>
#include<iomanip>
using namespace std;
int main(){

	int N;
	cin >> N;
	cout << fixed << setprecision(1);
	double n1, n2 ,n3;
	for(int i = 0; i < N; i++){
		cin >> n1 >> n2 >> n3;
		cout << ((n1*2) + (n2*3) + (n3*5))/10 << endl;
	}
}
