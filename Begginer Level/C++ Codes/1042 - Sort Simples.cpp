// Name of the problem: Sort Simples
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1042

#include<iostream>
using namespace std;
int main(){

	int a, b, c, mem, ord[3];
	cin >> a >> b >> c;
	ord[0] = a;
	ord[1] = b;
	ord[2] = c;
	while ((ord[0] > ord[1]) || (ord[1] > ord[2])){
		if(ord[0] > ord[1]){
			mem = ord[0];
			ord[0] = ord[1];
			ord[1] = mem;
		}
		else if (ord[1] > ord[2]){
			mem = ord[1];
			ord[1] = ord[2];
			ord[2] = mem;
		}
	}
	cout << ord[0] << endl << ord[1] << endl << ord[2] << endl << endl;
	cout << a << endl << b << endl << c << endl;

}
