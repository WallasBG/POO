import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Conta conta1 = new Conta(entrada.nextInt(), entrada.nextInt(), entrada.next(), entrada.nextDouble());
        Conta conta2 = new Conta(entrada.nextInt(), entrada.nextInt(), entrada.next(), entrada.nextDouble());

        while(true){ //1- 5
             int n = entrada.nextInt();
             if(n==5) break;

            int senha_conta1;

            switch (n){
                case 1://ver saldo
                    senha_conta1 = entrada.nextInt();
                    double saldo = conta1.getSaldo(senha_conta1);

                    if(saldo == -1.0) System.out.println("senha incorreta");
                    else System.out.printf("%.2f\n", saldo);
                    break;

                case 2://saque
                    double valor_saque = entrada.nextDouble();
                    senha_conta1 = entrada.nextInt();

                    if(conta1.sacar(valor_saque, senha_conta1)) System.out.println("saque realizado");
                    else System.out.println("saque não realizado");
                    break;

                case 3://deposito
                    double valor_deposito = entrada.nextDouble();
                    senha_conta1 = entrada.nextInt();
                    if(conta1.depositar(valor_deposito, senha_conta1)) System.out.println("depósito realizado");
                    else System.out.println("depósito não realizado");
                    break;

                case 4://transferencia
                    if(conta2.getNome().equals(entrada.next())){
                        double valor_transf = entrada.nextDouble();
                        senha_conta1 = entrada.nextInt();

                        if(conta1.transferencia(conta2, valor_transf, senha_conta1)) System.out.println("transferência realizada");
                        else System.out.println("transferência não realizada");
                    }
                    else System.out.println("nenhum usuário encontrado");
                    break;
            }
        }
    }
}
