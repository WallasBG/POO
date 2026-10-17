import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
//        Funcionario funcionario = new Funcionario(entrada.nextLine(), entrada.nextInt(),
//        entrada.nextInt());

        try{
            String nome = entrada.nextLine();
            int producao = entrada.nextInt();
            int horas = entrada.nextInt();

            Funcionario funcionario = new Funcionario(nome, producao, horas);
            int produtividade = funcionario.calcularProdutividade();

            System.out.printf("Produtividade: %d peças por hora%n", produtividade);
        }catch(ArithmeticException erro){
            System.out.println("Erro: horas trabalhadas não podem ser zero");
        }
        catch(Exception erro){
            System.out.println("Erro inesperado");
        }
    }
}

/*
catch(Exception erro){
    erro.printStackTrace();
}

Bom para o caso de vc nao saber qual a classe da excecao, dai a pilha vai te dizer

ou esse funciona tbm:

catch(ArithmeticException erro){
    System.err.printf("%nException: %s%n", erro);
}
ja coloca o .getMensage()

*/