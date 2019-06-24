// Name of the problem: Menor e Posição
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1180

#include<iostream>
using namespace std;
int main(){
    int N, menor, i_m;
    cin >> N;
    int X[N];
    for(int i = 0; i < N; i++){
        cin >> X[i];
        if(i == 0){
            menor = X[i];
            i_m = i;
        }
        if(X[i] < menor){
            menor = X[i];
            i_m = i;
        }
    }
    cout << "Menor valor: " << menor << endl;
    cout << "Posicao: " << i_m << endl;
}