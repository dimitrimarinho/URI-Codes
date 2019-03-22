// Name of the problem: Sequencia IJ 1
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1095

#include<iostream>
using namespace std;
int main(){

	int i = 1, j = 60;
	while(j!=0){
		cout << "I=" << i << " J=" << j << endl;
		i+= 3;
		j-= 5;
	}
	cout << "I=" << i << " J=" << j << endl;
}
