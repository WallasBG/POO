public class Funcionario {
    private String nomeFuncionario;
    private int qtdeProducao, horasTrabalhadas;

    public Funcionario(String nomeFuncionario,
                       int qtdeProducao, int horasTrabalhadas){
        this.nomeFuncionario = nomeFuncionario;
        this.qtdeProducao = qtdeProducao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    int calcularProdutividade(){
        return this.qtdeProducao / this.horasTrabalhadas;
    }
}
