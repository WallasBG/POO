package _03;

public class Familia extends Contato{
    public String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco){
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return this.imprimirBasico() + "Parentesco: " + parentesco;
    }
}
