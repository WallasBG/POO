package _01;

public class Chamado {
    private static int contadorChamados = 100; //uso de static faz o atributo ser da Classe e n do objeto
    private int codigoChamado;
    private TipoChamado tipo;
    private String data;
    private String origem;
    private String destino;
    private String horaPartida;
    private String horaChegada;
    private double kmInicial;
    private double kmFinal;
    private double valorTotal;

    private Veiculo veiculo;
    private Motorista motorista;
    private Cliente cliente;

    public Chamado(TipoChamado tipo,String data, String origem, String destino, String horaPartida, double kmInicial, Veiculo veiculo, Motorista motorista, Cliente cliente){

        this.tipo = tipo; this.data = data; this.origem = origem; this.destino = destino; this.horaPartida = horaPartida; this.kmInicial = kmInicial; this.veiculo = veiculo; this.motorista = motorista; this.cliente = cliente;

        veiculo.chamados.add(this);
        cliente.chamados.add(this);
        motorista.chamados.add(this);
    }

    public Chamado(TipoChamado tipo,String data, String origem, String destino, String horaPartida, String horaChegada, double kmInicial, double kmFinal, Veiculo veiculo, Motorista motorista, Cliente cliente){

        this.tipo = tipo; this.data = data; this.origem = origem; this.destino = destino; this.horaPartida = horaPartida; this.horaChegada = horaChegada; this.kmInicial = kmInicial; this.kmFinal = kmFinal; this.veiculo = veiculo; this.motorista = motorista; this.cliente = cliente;

        veiculo.chamados.add(this);
        cliente.chamados.add(this);
        motorista.chamados.add(this);
    }

    public void setMotorista(Motorista motorista){
        this.motorista.chamados.remove(this);
        this.motorista = motorista;
        motorista.chamados.add(this);
    }

    public void finalizarChamado(String horarioChegada, double kmFinal){
        this.horaChegada = horarioChegada;
        this.kmFinal = kmFinal;
    }
    private boolean isFinalizado(){
        return !(horaChegada == null);
    }
    private double calcularDistancia(){
        return kmFinal - kmInicial;
    }
    private double calcularValorTotal(){
        double km = calcularDistancia();
        if(tipo == TipoChamado.CORRIDA) return 3.59 * km;
        return 6.51 * km;
    }
    public void mostrarChamado(){
        codigoChamado = contadorChamados++;

        System.out.printf("Chamado: %d\n", codigoChamado);
        System.out.println("Data: "+data);
        if(tipo == TipoChamado.CORRIDA) System.out.println("Tipo: CORRIDA");
        else System.out.println("Tipo: VIAGEM");
        System.out.println("Cliente: "+cliente.getNome()+ " (CPF: "+cliente.getCpf()+")");
        System.out.println("Motorista: "+motorista.getNome()+" (CNH: "+motorista.getCnh()+")");
        System.out.println("Veículo: "+veiculo.getModelo()+" (Placa: "+veiculo.getPlaca()+")");
        System.out.println("Origem: "+origem);
        System.out.println("Destino: "+destino);
        System.out.println("Partida: "+horaPartida);

        if(!isFinalizado()){
            System.out.println("Chegada: Aguardando finalização...");
            return;
        }

        valorTotal = calcularValorTotal();
        System.out.println("Chegada: "+horaChegada);
        System.out.println("Distância: "+calcularDistancia()+" km");
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }
}