// Name: (1068) - Balanço de Parênteses I
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1068

#include<iostream>
#include<stack>
#include<vector>
using namespace std;
int main()
{
    string expression;
    while(cin >> expression)
    {
        bool balanceado = true;
        stack<char> parenteses;
        for (int letra = 0; letra < expression.size(); letra++)
        {
            if(expression[letra] == '(')
                parenteses.push(expression[letra]);
            else if(expression[letra] == ')')
                if(!parenteses.empty() && parenteses.top() == '(')
                    parenteses.pop();
                else
                {
                    balanceado = false;
                    break;
                }
        }
        if (balanceado && parenteses.empty())
            cout << "correct" << endl;
        else
            cout << "incorrect" << endl;
    }
}
