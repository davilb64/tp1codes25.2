package tecnicasdedesign.desenvolvimentodeprojetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private final String nome;
    private final String status;
    private final String dataInicio;
    private final String dataFim;
    List<Tarefa> tarefas = new ArrayList<>();
    private final Engenheiro engenheiro;

    //Construtor

    public Projeto(String nome, String status, String dataInicio, String dataFim, Engenheiro engenheiro) {
        this.nome = nome;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.engenheiro = engenheiro;
    }

    //getter

    public String getNome() {
        return nome;
    }

    //metodos

    public void adicionarTarefa(String descricao, String data, int horas, Funcionario funcionario) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);
        tarefa.setData(data);
        tarefa.setQtdeHoras(horas);
        tarefa.setFuncionario(funcionario);
        tarefas.add(tarefa);
    }

    public int calcularHorasTotal(){
        int total = 0;
        for(Tarefa tarefa : tarefas){
            total += (int) tarefa.getQtdeHoras();
        }
        return total;
    }

    public List<Tarefa> getTarefasPorData(String data) {
        List<Tarefa> tarefasFiltradas = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            if(data.equals(tarefa.getData())){
                tarefasFiltradas.add(tarefa);
            }
        }
        return tarefasFiltradas;
    }

    public List<Tarefa> getTarefasPorFuncionario(Funcionario funcionario) {
        List<Tarefa> tarefasFiltradas = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            if(funcionario.equals(tarefa.getFuncionario())){
                tarefasFiltradas.add(tarefa);
            }
        }
        return tarefasFiltradas;
    }

    public void mostrarProjeto(){
        System.out.println("------ PROJETO ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Status: " + this.status);
        System.out.println("Início: " + this.dataInicio);
        if (this.dataFim == null) {
            System.out.println("Término: em aberto");
        }
        else {
            System.out.println("Término: " + this.dataFim);
        }
        System.out.println("Engenheiro Responsável: "+this.engenheiro.getNome());
        System.out.println("Total de Tarefas: "+this.tarefas.size());
        System.out.println("Horas Totais: "+this.calcularHorasTotal());
    }

}
