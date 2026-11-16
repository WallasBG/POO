package _02;

public class Tarefa {
    private String descricao;
    private String data;
    private int qtdeHoras;
    private Funcionario funcionario;

    public Tarefa(String descricao, String data, int qtdeHoras, Funcionario funcionario){
        this.descricao = descricao;
        this.data = data;
        this.qtdeHoras = qtdeHoras;
        this.funcionario = funcionario;
    }
    public void setQtdeHoras(int qtdHoras){}

    public String getDescricao(){
        return descricao;
    }

    public Funcionario getFuncionario(){
        return funcionario;
    }

    public String getData(){
        return data;
    }

    public int getQtdeHoras(){
        return qtdeHoras;
    }
}
