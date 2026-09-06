import java.util.Scanner;

public class Cinco{
  public static void main(String[] args){
  	Scanner entrada = new Scanner(System.in);
  	int n = entrada.nextInt();
  	String [] estoque_nome = new String[n];
  	int [] estoque_quant = new int[n];

  	for(int i=0; i<n; i++){
  		estoque_nome[i] = entrada.next(); //Sem problemas com buffer, pois o next() nao le invisivel/separador do comeco
  		estoque_quant[i] = entrada.nextInt();
  	}

  	String nome;
  	int j;

  	while(true){
  		nome = entrada.next();
  		if(nome.equals("fim")) break; //A String nome marca o endereco de onde esta o conteudo, e nao o conteudo em si, por isso usa equals(). Se fosse tipo primitivo seria normal

  		for(j=0; j<n; j++){
			if(!estoque_nome[j].equals(nome)) continue;
			int quant = entrada.nextInt();
			System.out.println(nome + " " + quant);

			estoque_quant[j] -= quant;
			break;
		}
		if(j == n) System.out.println(nome + " produto não encontrado");
  	}
  	for(int i=0; i<n; i++){
  		System.out.printf("%s %d\n", estoque_nome[i], estoque_quant[i]);
  	}
  }
}