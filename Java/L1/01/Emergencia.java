public class Emergencia{
    public String nomeChamador;
    public String telefoneChamador;
    public String localEmergencia;
    public String dataHoraRelato;
    public String naturezaEmergencia;
    public String tipoResposta;
    public String statusResposta;
    public boolean chamadaMovel;
    public String coordenadasGPS;

    public Emergencia(String nomeChamador,
        String telefoneChamador,
        String localEmergencia,
        String dataHoraRelato,
        String naturezaEmergencia,
        String tipoResposta,
        String statusResposta,
        boolean chamadaMovel,
        String  coordenadasGPS)
    {

        this.nomeChamador = nomeChamador;
        this.telefoneChamador = telefoneChamador;
        this.localEmergencia = localEmergencia;
        this.dataHoraRelato = dataHoraRelato;
        this.naturezaEmergencia = naturezaEmergencia;
        this.tipoResposta = tipoResposta;
        this.statusResposta = statusResposta;
        this.chamadaMovel = chamadaMovel;
        this.coordenadasGPS = coordenadasGPS;
    }

    public void mostrarEmergencias(){
        System.out.printf("Nome do Chamador: %s\n", nomeChamador);
        System.out.printf("Telefone: %s\n", telefoneChamador);
        System.out.printf("Local da Emergência: %s\n", localEmergencia);
        System.out.printf("Data/Hora do Relato: %s\n", dataHoraRelato);
        System.out.printf("Natureza da Emergência: %s\n", naturezaEmergencia);
        System.out.printf("Tipo de Resposta: %s\n", tipoResposta);
        System.out.printf("Status da Resposta: %s\n", statusResposta);
        if(chamadaMovel){
            System.out.printf("Chamada via celular: Sim\n");
            System.out.printf("Coordenadas GPS: %s\n", coordenadasGPS);

        } 
        else System.out.printf("Chamada via celular: Não\n");
    }

}