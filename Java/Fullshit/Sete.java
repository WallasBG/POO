import java.util.Scanner;

public class Sete{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		do{
			if(n%2 == 0){
				n /= 2;
			}
			else{
				n = 3*n + 1;
			}
			System.out.print(n + " ");
		}
		while(n != 1);
		System.out.println();
	}
}