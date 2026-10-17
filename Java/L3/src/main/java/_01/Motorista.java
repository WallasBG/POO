package _01;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome, cnh;
    public List<Chamado> chamados = new ArrayList<>();

    public Motorista(String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome(){
        return nome;
    }

    public String getCnh(){
        return cnh;
    }
}