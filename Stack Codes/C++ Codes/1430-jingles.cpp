// Name: (1430) - Composição de Jingles
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1430

#include<iostream>
#include<map>
using namespace std;
int main()
{
    string composer;
    float partial = 0;
    int correct = 0;
    map<char, float> jingle;
    jingle.insert(make_pair('W', 1)); jingle.insert(make_pair('H', 0.5));
    jingle.insert(make_pair('Q', 0.25)); jingle.insert(make_pair('E', 0.125));
    jingle.insert(make_pair('S', 0.0625)); jingle.insert(make_pair('T', 0.03125));
    jingle.insert(make_pair('X', 0.015625));
    while(cin >> composer , composer != "*")
    {
        for(int i = 0; i < composer.size(); i++)
        {
            if(composer[i] == '/')
            {
                if (partial == 1)
                    correct++;
                partial = 0;
            }
            else
                partial += jingle[composer[i]];
        }
        cout << correct << endl;
        correct = 0;
    }
}
