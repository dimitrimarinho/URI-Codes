// Name of the problem: Aumento de Salário
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1048

#include<iostream>
#include<iomanip>
using namespace std;
int main(){

	cout << fixed << setprecision(2);
	double salary, new_salary, readjust_gain;
	int percentage;
	cin >> salary;

	// Cálculo do Novo Salário
	if(salary <= 400.00){
		new_salary = salary * 1.15;
		percentage = 15;
	}
	else if (400.01 <= salary && salary <= 800.00){
		new_salary = salary * 1.12;
		percentage = 12;
	}
	else if (800.01 <= salary && salary <= 1200.00){
		new_salary = salary * 1.10;
		percentage = 10;
	}
	else if (1200.01 <= salary && salary <= 2000.00){
		new_salary = salary * 1.07;
		percentage = 7;
	}
	else if (salary > 2000){
		new_salary = salary * 1.04;
		percentage = 4;
	}

	// Cálculo do Reajuste
	readjust_gain = new_salary - salary;

	cout << "Novo salario: " << new_salary << endl;
	cout << "Reajuste ganho: " << readjust_gain << endl;
	cout << "Em percentual: " << percentage << " %" << endl;
}
