// Name of the problem: Animal
// Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1049

#include<iostream>
using namespace std;
int main(){

	string w1, w2, w3;
	cin >> w1 >> w2 >> w3;

	if(w1 == "vertebrado"){
		if(w2 == "ave"){
			if(w3 == "carnivoro")
				cout << "aguia\n";
			else if(w3 == "onivoro")
				cout << "pomba\n";
		}
		else if(w2 == "mamifero"){
			if(w3 == "onivoro")
				cout << "homem\n";
			else if(w3 == "herbivoro")
				cout << "vaca\n";
		}
	}
	else if(w1 == "invertebrado"){
		if(w2 == "inseto"){
			if(w3 == "hematofago")
				cout << "pulga\n";
			else if(w3 == "herbivoro")
				cout << "lagarta\n";
		}
		else if(w2 == "anelideo"){
			if(w3 == "hematofago")
				cout << "sanguessuga\n";
			else if(w3 == "onivoro")
				cout << "minhoca\n";
		}
	}

}
