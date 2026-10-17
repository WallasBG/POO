public class Conta {
    private int numConta;
    private int senha;
    private String nome;
    private double saldo;

    public Conta(int numConta, int senha, String nome, double saldo){
        this.numConta = numConta;
        this.senha = senha;
        this.nome = nome;
        this.saldo = saldo;
    }
    public boolean sacar(double valor, int senha){
        if(saldo >= valor && valor>0 && this.senha == senha){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor, int senha){
        if(this.senha == senha && valor > 0){
            saldo += valor;
            return true;
        }
        else return false;
    }

    public boolean transferencia(Conta conta2, double valor, int senha){
        if(saldo >= valor && valor > 0 && this.senha == senha){
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        else return false;
    }
    public int getNumConta(){
        return numConta;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo(int senha){
        if(this.senha == senha) return saldo;
        return -1.0;
    }
}


