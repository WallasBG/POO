package Ex_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int agencia = entrada.nextInt(), numero = entrada.nextInt();
        double valor = entrada.nextDouble();

        Conta conta = new Conta(agencia, numero);
        Boolean catched = true;

        try{
            conta.depositoPersonalizado(valor);
            System.out.println("Depósito realizado com sucesso."); catched = false;
        }catch(DepositoInvalidoException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        finally {
            if(catched){
                System.out.printf("Valor %.2f incorreto. Saldo atual: %.2f\n", valor, conta.getSaldo());
            }
            else System.out.printf("Valor %.2f depositado na conta. Novo saldo: %.2f\n", valor, conta.getSaldo());
        }
    }
}