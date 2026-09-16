#include <iostream>
#include <string>
#include <cctype>

std::string TOlower(std::string palavra){
	for(int i=0; palavra[i] != '\0'; i++) palavra[i] = tolower(palavra[i]);
	return palavra;
}

int main(){
	int n; std::cin >> n;
	std::string dicionario[n][2];

	for(int i=0; i<n; i++) std::cin >> dicionario[i][0] >> dicionario[i][1];
	std::cin.ignore();//getchar()

	std::string frase, palavra = "";
	getline(std::cin,frase);
	int len = static_cast<int>(frase.length());
	std::string palavras[len]; int idx = 0;

	for(int i=0; i<=len; i++){
		if(i==len || frase[i] == 32){
			palavras[idx++] = palavra;
			palavra = "";
		}
		else if(frase[i] != 32) palavra += frase[i];
	}

	for(int i=0; i<idx; i++){
		for(int j=0; j<n; j++)
			if(TOlower(palavras[i]) == TOlower(dicionario[j][0])) palavras[i] = dicionario[j][1];
	}

	for(int i=0; i<idx; i++) std::cout << palavras[i] << " ";
	std::cout << std::endl;

	return 0;
}