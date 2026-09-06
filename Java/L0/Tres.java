import java.util.Scanner;

public class Tres{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int tipo = entrada.nextInt(), area = entrada.nextInt();
		float iptu;

		if((tipo != 1 && tipo != 2) || area <= 0)
			System.out.println("Entrada inválida!");
		else {
			if(tipo == 1){
				if(area < 200) iptu = area;
				else iptu = area*1.2f;
			} 
			else{
				if(area < 200) iptu = area * 1.1f;
				else iptu = area * 1.3f;
			}
			System.out.printf("%.2f\n", iptu);
		}
	}
}