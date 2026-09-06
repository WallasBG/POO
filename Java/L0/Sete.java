import java.util.Scanner;

public class Sete{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in, "UTF-8");
		int n = entrada.nextInt();
		String[][] dicionario = new String[n][2];

		for(int i=0; i<n; i++){
			dicionario[i][0] = entrada.next();//palavra
			dicionario[i][1] = entrada.next();//significado
		}

		entrada.nextLine();//getchar()
		
		String[] frase = entrada.nextLine().split(" ");
		for(int i=0; i<frase.length; i++){
			for(int j=0; j<n; j++){
				if(frase[i].equalsIgnoreCase(dicionario[j][0]))
					frase[i] = dicionario[j][1];
			}
		}
		for(int i=0; i<frase.length; i++){
			System.out.printf("%s ",frase[i]);
		}System.out.println();
	}
}