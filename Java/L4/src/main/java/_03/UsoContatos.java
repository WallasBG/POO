package _03;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UsoContatos{
    public static void main(String[] args){
        List<Contato> contatos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        boolean run = true;

        while(run){
            int opcao = entrada.nextInt();
            switch(opcao){
                case(1):
                    int subtipo = entrada.nextInt();
                    if(subtipo == 1){//amigo
                        Contato amigo = new Amigo(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.nextInt());

                        contatos.add(amigo);
                    }
                    else if(subtipo == 2){//familia
                        Contato familia = new Familia(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next());

                        contatos.add(familia);
                    }
                    else{//colega de trabalho
                        Contato colegaDeTrabalho = new ColegasDeTrabalho(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next());

                        contatos.add(colegaDeTrabalho);
                    }
                    break;

                case(2):
                    for(int i=0; i<contatos.size(); i++){
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                    break;

                case(3):
                    for(int i=0; i<contatos.size(); i++){
                        if(contatos.get(i) instanceof Familia){
                            System.out.println(contatos.get(i).imprimirContato());
                        }
                    }
                    break;

                case(4):
                    for(int i=0; i<contatos.size(); i++){
                        if(contatos.get(i) instanceof Amigo){
                            System.out.println(contatos.get(i).imprimirContato());
                        }
                    }
                    break;

                case(5):
                    for(int i=0; i<contatos.size(); i++){
                        if(contatos.get(i) instanceof ColegasDeTrabalho){
                            System.out.println(contatos.get(i).imprimirContato());
                        }
                    }
                    break;

                case(6):
                    for(int i=0; i<contatos.size(); i++){
                        if(contatos.get(i) instanceof Amigo && ((Amigo) contatos.get(i)).grau == 1);

                        else if(contatos.get(i) instanceof Familia && ((Familia) contatos.get(i)).parentesco.equals("irmão"));

                        else if(contatos.get(i) instanceof ColegasDeTrabalho && ((ColegasDeTrabalho) contatos.get(i)).tipo.equals("colega"));

                        else continue;
                        System.out.println(contatos.get(i).imprimirContato());
                    }
                    break;

                case(7):
                    int idx = entrada.nextInt() -1;
                    System.out.println(contatos.get(idx).imprimirContato());
                    break;

                case(8):
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
