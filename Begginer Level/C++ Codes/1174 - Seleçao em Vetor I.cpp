// Name of the problem: Seleçao em Vetor I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1174

#include<iostream>
#include<iomanip>
using namespace std;
int main(){
    cout << fixed << setprecision(1);
    double A[100];
    for(int i = 0; i < 100; i++){
        cin >> A[i];
    }
    for(int i = 0; i < 100; i++){
        if(A[i] <= 10)
            cout << "A[" << i << "] = " << A[i] << endl;
    }
}