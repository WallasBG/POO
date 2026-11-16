package _02;

public class Operario extends Funcionario{
    private float valorProducao;
    private int quantidadeProduzida;

    public Operario(){}
    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida){
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao; this.quantidadeProduzida = quantidadeProduzida;

        this.setSalario(this.valorProducao * this.quantidadeProduzida);
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
}