// Name: (1244) - Ordenação por Tamanho
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1244

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
struct ordenar
{
    string ordpalavra;
    int sizestring;
};
bool cmp(ordenar i, ordenar j)
{
        return( (i.sizestring > j.sizestring) );
}
int main()
{
    int N;
    string frase;
    struct ordenar aux;
    cin >> N;
    vector<ordenar> tamstring;
    cin.ignore();
    while (N != 0 , N--)
    {
        getline(cin, frase);
        for (int i = 0; i < frase.size(); i++)
        {
            while(i < frase.size() && frase[i] != ' ')
            {
                aux.ordpalavra+= frase[i];
                i++;
            }
            aux.sizestring =  aux.ordpalavra.size();
            tamstring.push_back(aux);
            aux.ordpalavra = "";
        }
        stable_sort(tamstring.begin(), tamstring.end(), cmp);
        for (int i = 0; i < tamstring.size(); i++)
        {
            if(i != tamstring.size()-1)
                cout << tamstring[i].ordpalavra << " ";
            else
                cout << tamstring[i].ordpalavra;
        }
        cout << endl;
        tamstring.erase(tamstring.begin(), tamstring.end());
    }
}
