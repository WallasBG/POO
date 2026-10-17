package Ex_02;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        ValidarSenha validar = new ValidarSenha();
        Boolean continua = true;

        do{
            try{
                validar.verificarMaiusculas(entrada.nextLine());
                System.out.println("Senha válida");
                continua = false;
            }catch (IllegalArgumentException erro){
                System.out.println(erro.getMessage());
                //System.err.printf("%s\n", erro);
            }
        }while(continua);
    }
}
