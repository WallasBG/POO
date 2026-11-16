package _04;

public class Cliente implements Classificavel{
    private String cpf, nome, endereco;

    public Cliente(String cpf, String nome, String endereco){
        this.cpf = cpf; this.nome = nome; this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;

        int min = Math.min(this.nome.length(), compara.nome.length());
        int i=0;
        for( ; i<min && (this.nome.charAt(i) == compara.nome.charAt(i)); i++);

        return this.nome.charAt(i) < compara.nome.charAt(i);
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
}
