import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String nomeChamador;
        String telefoneChamador;
        String localEmergencia;
        String dataHoraRelato;
        String naturezaEmergencia;
        String tipoResposta;
        String statusResposta;
        boolean chamadaMovel;
        String chamada_movel;
        String coordenadasGPS;

        Scanner entrada = new Scanner(System.in);
        int n = Integer.parseInt(entrada.nextLine());
        //entrada.nextLine();//getchar
        Emergencia arr_emergencias[] = new Emergencia[n];

        for(int i=0; i<n; i++){
            nomeChamador = entrada.nextLine();
            telefoneChamador = entrada.nextLine();
            localEmergencia = entrada.nextLine();
            dataHoraRelato = entrada.nextLine();
            naturezaEmergencia = entrada.nextLine();
            tipoResposta = entrada.nextLine();
            statusResposta = entrada.nextLine();

            chamada_movel = entrada.nextLine();
            if(chamada_movel.equalsIgnoreCase("Sim")){
                chamadaMovel = true;
                coordenadasGPS = entrada.nextLine();
            }
            else{
                chamadaMovel = false;
                coordenadasGPS = "\0";
            } 

            Emergencia ocorrencia = new Emergencia(
                nomeChamador, telefoneChamador, localEmergencia, dataHoraRelato, naturezaEmergencia, tipoResposta,
                statusResposta, chamadaMovel, coordenadasGPS
            );

            arr_emergencias[i] = ocorrencia;            
        }

        for(int i=0; i<n; i++){
            System.out.println("Emergência #" + (i+1) + "\n");
            System.out.println("--- Informações da Emergência ---\n");
            arr_emergencias[i].mostrarEmergencias();
        }
    }
}