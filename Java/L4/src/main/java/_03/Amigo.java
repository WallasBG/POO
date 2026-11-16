package _03;

public class Amigo extends Contato{
    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau){
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String grau_str;

        switch (grau){
            case(1):
                grau_str = "Melhor Amigo";
                break;
            case(2):
                grau_str = "Amigo";
                break;
            case(3):
                grau_str = "Conhecido";
                break;
            default:
                grau_str = "grau desconhecido";
                break;
        }

        return this.imprimirBasico() + "Grau: " + grau_str;
    }
}
