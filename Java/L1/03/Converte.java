import java.util.Scanner;

public class Converte{
	public static void main(String[] Args){
		Scanner entrada = new Scanner(System.in);
		Double temp_celsius = entrada.nextDouble();

		Temperatura T1 = new Temperatura(temp_celsius);

		T1.celsiusToFahrenheit();
		System.out.println(T1.toString() + "Fahrenheit");

		T1.fahrenheiToCelsius();
		System.out.println(T1.toString() + "Celsius");
	}
}