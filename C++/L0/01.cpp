#include <iostream>
#include <iomanip>

int main(){
	float altura;
	char S;

	std::cin>>altura;
	std::cin>>S;

	if(altura <= 0 || (S != 'm' && S != 'f')) std::cout<<"Entrada inválida!"<<std::endl;
	else{
		float peso_ideal;
		std::cout << std::fixed << std::setprecision(1);

		if(S=='f') peso_ideal = 62.1 * altura - 44.7;
		else peso_ideal  = 72.7 * altura - 58;
		std::cout<<peso_ideal<<" kg"<<std::endl;
	}

	return 0;
}