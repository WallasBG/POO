package _01;

public class Moto extends Veiculo{
    private int qtdeCilindradas;

    public Moto(){}
    public Moto(String placa, int numeroPortas, float preco, int qtdeCilindradas){
        super(placa, numeroPortas, preco);
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + " Quantidade de cilindradas: " + qtdeCilindradas;
    }
}