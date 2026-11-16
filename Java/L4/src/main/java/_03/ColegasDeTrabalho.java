package _03;

public class ColegasDeTrabalho extends  Contato{
    public String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo){
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return this.imprimirBasico() + "Relacionamento de trabalho: " + tipo;
    }
}
