// Name of the problem: Múltiplos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1044

#include<iostream> 
using namespace std;
int main(){

	int A, B;
	cin >> A >> B;
	if( (A % B == 0) || (B % A == 0) )
		cout << "Sao Multiplos\n";
	else
		cout << "Nao sao Multiplos\n";

}
