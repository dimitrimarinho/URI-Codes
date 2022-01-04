// Name of the problem: Crescente e Decrescente
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1113

#include<iostream>
using namespace std;
int main(){
    int X, Y;
    while(cin >> X >> Y, X != Y){
        if(X > Y)
            cout << "Decrescente\n";
        else
            cout << "Crescente\n";        
    }
}