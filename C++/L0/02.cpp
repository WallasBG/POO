#include <iostream>
#include <iomanip>

int main(){
	float consumo; std::cin>>consumo;

	float custo;
	if(consumo <= 500)
		custo = consumo * 0.02;
	else if(consumo > 500 && consumo <= 1000)
		custo = 500 *0.10 + 0.05 * (consumo - 500);
	else
		custo = 0.35 * 1000 + 0.10 * (consumo - 1000);

	std::cout << std::fixed << std::setprecision(2);
	std::cout << custo << " " << 5.00 << " " << custo+5 << std::endl;
	
	return 0;
}