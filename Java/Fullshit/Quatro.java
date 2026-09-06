public class Quatro{
	public static void main(String[] args){
		int fatorial = 1;

		for (int n = 1; n <= 10; n++) {
			System.out.println("fat de " + (n-1) + " eh: " + fatorial);
			fatorial *= n;
		}
	}
}