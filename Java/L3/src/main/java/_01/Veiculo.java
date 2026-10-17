package _01;

import java.util.List;
import java.util.ArrayList;

public class Veiculo {
    private String modelo;
    private String placa;
    public List<Chamado> chamados = new ArrayList<>();

    public Veiculo(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public String toString(){
        return "Modelo: " + modelo + "," + "Placa: " + placa;
    }
}