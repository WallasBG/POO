package _01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf, nome;
    public List<Chamado> chamados = new ArrayList<>();

    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}