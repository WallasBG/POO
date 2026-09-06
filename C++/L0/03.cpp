#include <iostream>
#include <iomanip>

int main(){
	int tipo, area;
	std::cin >> tipo >> area;
	
	if((tipo != 1 && tipo != 2) || area <= 0) std::cout << "Entrada inválida!" << std::endl;
	else{
		float iptu;
		if(tipo == 1){
			if(area < 200) iptu = area;
			else iptu = area * 1.2;
		}
		else{
			if(area < 200) iptu = area * 1.1;
			else iptu = area * 1.3;
		}
		std::cout << std::fixed << std::setprecision(2);
		std::cout << iptu << std::endl;
	}


	return 0;
}