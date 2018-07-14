// Name of the problem: Média 3
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1040

#include<iostream>
#include<iomanip>
using namespace std;
int main(){

	cout << fixed << setprecision(1);
	float n1,n2,n3,n4,n5, result;
	cin >> n1 >> n2 >> n3 >> n4;
	result = (n1*2+n2*3+n3*4+n4*1)/10;
	cout << "Media: " << result << endl;
	if (result >= 7.0){
		cout << "Aluno aprovado." << endl;
	}
	else if (result >= 5.0 && result <= 6.9){
		cout << "Aluno em exame." << endl;	
		cin >> n5;
		result = (result + n5)/2;
		cout << "Nota do exame: " << n5 << endl;
		if (result >= 5.0){
			cout << "Aluno aprovado." << endl;
			cout << "Media final: " << result << endl;
		}
		else{
			cout << "Aluno reprovado." << endl;
			cout << "Media final: " << result << endl;
		}
	}
	else{
		cout << "Aluno reprovado." << endl;
	}
}
