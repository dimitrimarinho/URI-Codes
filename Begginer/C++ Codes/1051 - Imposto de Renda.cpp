// Name of the problem: Imposto de Renda
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1051

#include<iostream>
#include<iomanip>
using namespace std;
int main(){

	cout << fixed << setprecision(2);
	double salario, imposto_pago = 0, calc;
	cin >> salario;
	if (salario < 2000)
		cout << "Isento\n";
	else{
		if(salario > 2000 && salario <= 3000){
			calc = salario - 2000;
			imposto_pago = calc * 0.08;
		}
		else if (salario > 3000 && salario <= 4500){
				imposto_pago += 1000 * 0.08;
				calc = salario - 3000;
				imposto_pago += calc * 0.18;
		}
		else if(salario > 4500){
			imposto_pago += 1000 * 0.08;
			imposto_pago += 1500 * 0.18;
			calc = salario - 4500;
			imposto_pago += calc * 0.28;
		}

		cout << "R$ " << imposto_pago << endl;
	}

}
