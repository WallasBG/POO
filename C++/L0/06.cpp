#include <iostream>
#include <string>

int main(){
	int n; std::cin >> n;
	std::string palavras[n];

	for(int i=0; i<n; i++) std::cin >> palavras[i];

	std::string procurado; std::cin >> procurado;
	bool achou = false;

	int k;
	for(k=0; k<n; k++) if(palavras[k] == procurado) break;
	if(k == n){
		std::cout << "palavra incorreta" << std::endl;

		int i;
		for(i=0; i<n && !achou; i++){
			int len = static_cast<int>(palavras[i].length()); //o .length retorna do tipo std::size_t (long unsigned int)

			for(int j=0; j<(len-1) && !achou; j++){
				
				std::swap(palavras[i][j],palavras[i][j+1]);
				if(procurado == palavras[i]) achou = true;
				std::swap(palavras[i][j],palavras[i][j+1]);
			}
		}

		if(achou) std::cout << palavras[i-1] << "?" <<std::endl;
		else std::cout << "nenhuma sugestão" << std::endl;
	}
	else std::cout << "palavra correta" << std::endl;

	return 0;
}