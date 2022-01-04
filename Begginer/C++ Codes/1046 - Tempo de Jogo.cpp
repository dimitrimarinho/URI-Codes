// Name of the problem: Tempo de Jogo
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1046

#include<iostream>
using namespace std;
int main(){

		int initial_time, final_time, duration;
		cin >> initial_time >> final_time;
		if(initial_time > final_time)
			duration = (24 - initial_time) + final_time;
		else if(initial_time < final_time)
			duration = final_time - initial_time;
		else
			duration = 24;
		cout << "O JOGO DUROU " << duration << " HORA(S)\n";

}
