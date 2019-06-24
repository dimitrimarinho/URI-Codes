// Name: (1281) - Ida à Feira
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1281

#include<iostream>
#include<map>
#include<iomanip>
using namespace std;
int main()
{
    cout << fixed << setprecision(2);
    int N, M, P, quant;
    float valor, total = 0;
    string fruta;
    map <string, float> feira;
    cin >> N;
    while ( N != 0 , N--)
    {
        cin >> M;
        while(M != 0 , M--)
        {
            cin >> fruta;
            cin >> valor;
            feira[fruta] = valor;
        }
        cin >> P;
        while(P != 0 , P--)
        {
            cin >> fruta;
            cin >> quant;
            total += feira[fruta] * quant;
        }
        cout << "R$ " << total << endl;
        total = 0;
    }
}
