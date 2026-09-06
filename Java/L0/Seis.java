import java.util.Scanner;

public class Seis{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		String [] palavras = new String[n];

		for(int j=0; j<n; j++) palavras[j] = entrada.next();

		String procurado = entrada.next();
		int k;
		for(k=0; k<n; k++) if(palavras[k].equals(procurado)) break;
		if(k!=n) System.out.println("palavra correta");
		else{
			System.out.println("palavra incorreta");

			int idx;
			boolean achou = false;
			StringBuilder plDaVez = new StringBuilder();
			for(int j=0; j<n && !achou; j++){
				idx = palavras[j].length() - 1;
				plDaVez = new StringBuilder(palavras[j]);
				for(int i=0; i<idx && !achou; i++){
					plDaVez.setCharAt(i, palavras[j].charAt(i+1));
					plDaVez.setCharAt(i+1, palavras[j].charAt(i));

					achou = procurado.equals(plDaVez.toString());//compara String com String. Nao da para comparar String com StringBuilder

					plDaVez.setCharAt(i, palavras[j].charAt(i));
					plDaVez.setCharAt(i+1, palavras[j].charAt(i+1));
				}
			}
			if(achou) System.out.printf("%s?\n", plDaVez);
			else System.out.println("nenhuma sugestão");
		}
	}
}