// Name: (1069) - Diamantes e Areia
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1069

#include<iostream>
#include<stack>
using namespace std;
int main()
{
    int N;
    cin >> N;
    string minerar;
    for(int i = 0; i < N; i++)
    {
                stack<char> diamante;
                int found = 0;
                cin >> minerar;
                for(int charx = 0; charx < minerar.size(); charx++)
                {
                    if(minerar[charx] != '.')
                    {
                        if(minerar[charx] == '>' && !diamante.empty() && diamante.top() == '<')
                        {
                            diamante.pop();
                            found++;
                        }
                        else
                            diamante.push(minerar[charx]);
                    }
                }
                cout << found << endl;
    }
}
