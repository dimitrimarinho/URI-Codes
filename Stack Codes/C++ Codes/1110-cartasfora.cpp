// Name: (1110) - Jogando Cartas Fora
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1110

#include<iostream>
#include<queue>
#include<vector>
using namespace std;
int main()
{
    int cards;
    while(cin >> cards, cards != 0)
    {
        queue<int> last;
        vector<int> discarded;
        for(int i = 1; i <= cards; i++)
        {
            last.push(i);
        }
        while(!last.empty())
        {
            discarded.push_back(last.front());
            last.pop();
            int aux = last.front();
            last.pop();
            last.push(aux);
        }
        cout << "Discarded cards: ";
        int cont = 1;
        for(vector<int>::iterator it = discarded.begin(); it != discarded.end()-1; it++)
        {
            if(cont < cards-1)
            {
                cout << (*it) << ", ";
                cont++;
            }
            else
                cout << (*it);
        }
        cout << endl;
        cout << "Remaining card: " << discarded[cards-1] << endl;
    }
}
