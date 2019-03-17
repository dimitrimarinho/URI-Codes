// Name of the problem: Tempo de Jogo com Minutos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1047

#include<iostream>
using namespace std;
int main(){

	int i_h, i_m, f_h, f_m, duration_h = 0, duration_m = 0;
	cin >> i_h >> i_m >> f_h >> f_m;

	// Calculando duração dos minutos
	if(f_m >= i_m){
		duration_m = f_m - i_m;
	}
	else{
		duration_m = (60 + f_m) - i_m;
		f_h--;
	}

	// Calculando duração das horas
	if(f_h > i_h)
		duration_h = f_h - i_h;
	else if(f_h == i_h){
			if(duration_m == 0)
				duration_h = 24;
			else
				duration_h = 0;
	}
	else{
		duration_h = (24 - i_h) + f_h;
	}

	cout << "O JOGO DUROU " << duration_h << " HORA(S) E " << duration_m << " MINUTO(S)\n";

}
