import java.util.Scanner;

public class Quatro{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String carac;
		int quant_h = 0, quant_m = 0; 

		do{
			carac = entrada.next();
			if(carac.charAt(0) == 'h') quant_h++;
			else if(carac.charAt(0) == 'm') quant_m++;
		}
		while(carac.charAt(0) != 'q');

		System.out.printf("%d %d\n%.2f %.2f ", quant_h, quant_m, quant_h*12.5f, quant_m*7.4f);
		System.out.printf("%.2f\n", quant_h*12.5f + quant_m*7.4f);
	}
}