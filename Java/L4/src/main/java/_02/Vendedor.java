package _02;

public class Vendedor extends Funcionario{
    public float comissaoVenda;
    public int quatidadeVendas;

    public Vendedor(){}
    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int numeroVendas){
        super(nome, dataNascimento, salario);
        this.comissaoVenda = comissaoVenda; this.quatidadeVendas = numeroVendas;

        setSalario(salario + this.comissaoVenda * this.quatidadeVendas);
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getNumeroVendas(){
        return quatidadeVendas;
    }

    public void setNumeroVendas(){
        this.quatidadeVendas = quatidadeVendas;
    }
}