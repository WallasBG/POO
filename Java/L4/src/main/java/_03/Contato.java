package _03;

public abstract class Contato {
    protected  String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario){
        this.nome = nome; this.apelido = apelido; this.email = email; this.aniversario = aniversario;
    }
    public String imprimirBasico(){
        return String.format("Nome: %s\nApelido: %s\nEmail: %s\nAniversário: %s\n", nome, apelido, email, aniversario);
    }
    public abstract String imprimirContato();
}
