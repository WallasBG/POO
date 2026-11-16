package _02;

public class Funcionario {
    private String nome;
    private String dataNascimento;
    private float salario;

    public Funcionario(){}
    public Funcionario(String nome, String dataNascimento, float salario){
        this.nome = nome; this.dataNascimento = dataNascimento; this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public float getSalario() {
//        if(this instanceof Chefe){
//            Chefe this_casting = (Chefe) this;
//            return this_casting.getSalario();
//        }
//        else if(this instanceof Vendedor){
//            Vendedor this_casting = (Vendedor) this;
//            return this_casting.getSalario() + this_casting.getComissaoVenda() * this_casting.getNumeroVendas();
//        }
//        else if(this instanceof Operario){
//            Operario this_casting = (Operario) this;
//            return this_casting.getValorProducao() * this_casting.getQuantidadeProduzida();
//        }
//        //this instanceof Horista
//        Horista this_casting = (Horista) this;
//        return this_casting.getValorHora() * this_casting.getTotalHoras();

        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}