import java.util.Scanner;

public class Dois{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float consumo = entrada.nextFloat();
		//System.out.println(consumo);

		float custo;
		if(consumo <= 500)
			custo = consumo * 0.02f;
		else if(consumo > 500 && consumo <= 1000)
			custo = 500 *0.10f + 0.05f * (consumo - 500);
		else
			custo = 0.35f * 1000 + 0.10f * (consumo - 1000);

		System.out.printf("%.2f 5.00 %.2f\n", custo, custo + 5);
	}
}