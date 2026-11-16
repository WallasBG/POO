package _02;

import _01.Chamado;

import java.util.List;
import java.util.ArrayList;

public class Projeto {
    private String nome;
    private String status;
    private String dataInicio;
    private String dataFim;
    private List<Tarefa> tarefas = new ArrayList<>();
    private Engenheiro engenheiro;

    public Projeto(String nome, String status, String dataInicio, String dataFim, Engenheiro engenheiro){
        this.nome = nome; this.status = status; this.dataInicio = dataInicio; this.dataFim = dataFim; this.engenheiro = engenheiro;
    }
    public void adicionarTarefa(String descricao, String data, int horas, Funcionario funcionario){
        tarefas.add(new Tarefa(descricao, data, horas, funcionario));
    }
    public int calcularHorasTotal(){
        int horasTotal = 0;
        for(int i=0; i<tarefas.size(); i++){
            horasTotal += tarefas.get(i).getQtdeHoras();
        }
        return horasTotal;
    }
    public List<Tarefa> getTarefasPorData(String data){
        List<Tarefa> tarefasData = new ArrayList<>();
        for(int i=0; i<tarefas.size(); i++){
            if(tarefas.get(i).getData().equals(data)) tarefasData.add(tarefas.get(i));
        }
        return tarefasData;
    }
    public List<Tarefa> getTarefasPorFuncionario(Funcionario funcionario){
        List<Tarefa> tarefasFuncionario = new ArrayList<>();
        for(int i=0; i<tarefas.size(); i++){
           if(tarefas.get(i).getFuncionario() == funcionario) tarefasFuncionario.add(tarefas.get(i));
        }
        return tarefasFuncionario;
    }
    public void mostrarProjeto(){
        System.out.println("------ PROJETO ------");
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
        System.out.println("Início: " + dataInicio);
        if(dataFim != null) System.out.println("Término: " + dataFim);
        else System.out.println("Término: em aberto");
        System.out.println("Engenheiro Responsável: " + engenheiro.getNome());
        System.out.printf("Total de Tarefas: %d\n", tarefas.size());
        System.out.printf("Horas Totais: %d\n", this.calcularHorasTotal());
    }
    public String getNome(){
        return nome;
    }
}