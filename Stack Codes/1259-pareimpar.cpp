// Name: (1259) - Pares e Ímpares
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1259

#include<iostream>
#include<vector>
#include<algorithm>
#include<functional>        // para ordenar de forma decrescente com greater<int>()
using namespace std;
int main()
{
    int N, num;
    cin >> N;
    vector<int> par;
    vector<int> impar;
    while(N != 0, N--)
    {
        cin >> num;
        if (num % 2 == 0)
            par.push_back(num);
        else
            impar.push_back(num);
    }
    sort(par.begin(), par.end());
    sort(impar.begin(), impar.end(), greater<int>());
    for(int i = 0; i < par.size(); i++)
        cout << par[i] << endl;
    for(int i = 0; i < impar.size(); i++)
        cout << impar[i] << endl;
}
