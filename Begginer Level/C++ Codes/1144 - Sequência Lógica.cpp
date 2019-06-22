// Name of the problem: Sequência Lógica
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1144

#include<iostream>
using namespace std;
int main(){

	int N, h=1 ,j=(h*h), k=(h*h*h), line = 1;
	cin >> N;
	for (int i = 0; i < 2 * N; i++){
		if(line == 2){
			j++;
			k++;
		}
		cout << h << " " << j << " " << k << endl;
		if(line == 2){
			h++;
			j++;
			line = 0;
		}
		j = (h*h);
		k = (h*h*h);
		line++;
	}
}
