// Name of the problem: Distância Entre Dois Pontos
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1015

#include<iostream>
#include<iomanip>
#include<math.h>
using namespace std;
int main(){
	float x1, y1, x2, y2;
	float distancia;
	cin >> x1 >> y1 >> x2 >> y2;
	cout << fixed << setprecision(4);
	distancia = sqrt( pow((x2-x1),2) + pow((y2-y1),2) );
	cout << distancia << endl;
	
}
