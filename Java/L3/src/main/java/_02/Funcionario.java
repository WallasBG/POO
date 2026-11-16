package _02;

public class Funcionario {
    private String cargo;
    private String nome;

    public Funcionario(String nome, String cargo){
        this.nome = nome; this.cargo = cargo;
    }
    public String getNome(){
        return nome;
    }
}
