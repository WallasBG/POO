#include <iostream>
#include <iomanip>

int main(){
	char s;
	int quant_h = 0 , quant_m = 0;

	while(true){
		std::cin >> s;
		//std::cout << s << std::endl;
		if(s == 'q') break;

		if(s == 'h') quant_h++;
		else if(s == 'm') quant_m++;
	}

	std::cout << quant_h << " " << quant_m << std::endl;

	std::cout << std::fixed << std::setprecision(2);
	std::cout << quant_h * 12.5 << " " << quant_m * 7.4 << " ";
	std::cout << quant_h * 12.5 + quant_m * 7.4 << std::endl;


	return 0;
}
