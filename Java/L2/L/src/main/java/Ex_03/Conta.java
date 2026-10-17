package Ex_03;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo = 0.0;
    private double LIMITE_DEPOSITO = 10000.0;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositoPersonalizado(double valor) throws DepositoInvalidoException{
        if(valor <= 0)
            throw new DepositoInvalidoException("Valor inválido para depósito");
        else if(valor > LIMITE_DEPOSITO)
            throw new DepositoInvalidoException("Valor acima do limite permitido de 10000.00");

        //caso nao seja lancada
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLIMITE_DEPOSITO() {
        return LIMITE_DEPOSITO;
    }
}
