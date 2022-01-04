// Name of the problem: Seleçao em Vetor I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1174

#include<iostream>
using namespace std;
int main(){
    int N, fat = 1;
    cin >> N;
    for(int i = N; i > 0; i--){
        fat*= i;
    }
    cout << fat << endl;
}

