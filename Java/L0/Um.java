import java.util.Scanner;

public class Um{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float altura = entrada.nextFloat();
		String sexo = entrada.next();
		char s = sexo.charAt(0);


		//System.out.println(altura + " " +  s);

		if(altura <= 0 || (s!='m' && s!='f')){
			System.out.println("Entrada inválida!");
		}
		else{
			if(s == 'm') System.out.printf("%.1f kg\n", 72.7 * altura -58);
			else System.out.printf("%.1f kg\n", 62.1 * altura -44.7);
		}
	}
}