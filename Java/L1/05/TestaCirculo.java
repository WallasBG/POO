import java.util.Scanner;

public class TestaCirculo{
	public static void main(String[] args){

		// Circulo circulo1,circulo2,circulo3;
		// circulo1 = new Circulo(3,3,1);
		// circulo2 = new Circulo(2,1,4);
		// circulo3 = circulo1;

		// System.out.println(circulo1.getX() + " " + circulo1.getY());
		// System.out.println(circulo2.getX() + " " + circulo2.getY());
		// System.out.println(circulo3.getX() + " " + circulo3.getY());

		// int circulo = (int) circulo1.circunferencia();
		// System.out.print(circulo1.getRaio());
		// System.out.println(" " + circulo);

		//--------------------------------

		Scanner entrada = new Scanner(System.in);

		Circulo[] primeiro = new Circulo[3];
		for(int i=0; i<3; i++){
			Circulo obj = new Circulo(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
			primeiro[i] = obj;
		}	

		Circulo[] segundo = new Circulo[3];
		segundo = primeiro;
		Circulo[] terceiro = new Circulo[3];
		for(int i=0; i<3; i++){
			Circulo obj1 = new Circulo(primeiro[i].getX(),primeiro[i].getY(),primeiro[i].getRaio());
			terceiro[i] = obj1;
		}

		for(int i=0; i<3; i++)
			primeiro[i].setRaio(entrada.nextInt());

		System.out.println("vetor 1:");
		for(int i=0; i<3; i++)
			System.out.println(primeiro[i].getX() + " " + primeiro[i].getY() + " " + primeiro[i].getRaio());
		
		System.out.println("vetor 2:");
		for(int i=0; i<3; i++)
			System.out.println(segundo[i].getX() + " " + segundo[i].getY() + " " + segundo[i].getRaio());

		System.out.println("vetor 3:");
		for(int i=0; i<3; i++)
			System.out.println(terceiro[i].getX() + " " + terceiro[i].getY() + " " + terceiro[i].getRaio());
	}
}