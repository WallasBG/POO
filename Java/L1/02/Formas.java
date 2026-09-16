import java.util.Scanner;

public class Formas{
	public static void main(String[] args){
		Retangulo R1 = new Retangulo(), R2 = new Retangulo();

		Scanner entrada = new Scanner(System.in);
		R1.setComprimento(entrada.nextInt());
		R1.setLargura(entrada.nextInt());

		R2.setComprimento(entrada.nextInt());
		R2.setLargura(entrada.nextInt());

		System.out.printf("%d %d %d %d\n", R1.getComprimento(), R1.getLargura(), R1.perimetro(), R1.area());
		System.out.printf("%d %d %d %d\n", R2.getComprimento(), R2.getLargura(), R2.perimetro(), R2.area());
	}
}