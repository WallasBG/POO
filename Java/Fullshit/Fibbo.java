import java.util.Scanner;

public class Fibbo{
	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int f0 = 0, f1 = 1;

		for(int i=0; i<=n || f0<=100; i++){
			System.out.print(f0 + " ");
			int aux = f1;
			f1 = f0 + f1;
			f0 = aux;
		}
	}
}