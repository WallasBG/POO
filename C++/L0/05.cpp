#include <iostream>
#include <string>

int main(){
	int n; std::cin >> n;
	std::string produtos[n];
	int quant_prod[n];
	//produtos[0] = "gg";

	for(int i=0; i<n; i++){
		// std::string prod;
		// int quant;
		std::cin >> produtos[i];
		std::cin >> quant_prod[i];
	}

	// for(int i=0; i<n; i++){
	// 	std::cout << produtos[i] << " ";
	// 	std::cout << quant_prod[i] << std::endl;
	// }

	//std::string procurado; std::cin >> procurado;

	while(true){
		std::string procurado; std::cin >> procurado;
		if(procurado == "fim") break;

		int j;
		for(j=0; j<n; j++){
			if(procurado == produtos[j]){
				int quant_retirar; std::cin >> quant_retirar;
				quant_prod[j] -= quant_retirar;
				std::cout << procurado << " " << quant_retirar <<std::endl;
				break;	
			} 
		}

		if(j==n) std::cout << procurado << " produto não encontrado" << std::endl;
	}
	
	for(int i=0; i<n; i++) std::cout << produtos[i] << " " << quant_prod[i] << std::endl;

	return 0;
}
