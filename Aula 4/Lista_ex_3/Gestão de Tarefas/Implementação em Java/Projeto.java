import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private List<Tarefa> listaTarefas;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.listaTarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void addTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public void removeTarefa(Tarefa tarefa) {
        listaTarefas.remove(tarefa);
    }

    public void marcarConcluida(Tarefa tarefa) {
        tarefa.marcarConcluida();
    }

    public double calcularProgresso() {
        int totalTarefas = listaTarefas.size();
        int tarefasConcluidas = 0;

        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas++;
            }
        }

        if (totalTarefas == 0) {
            return 0;
        }

        return (tarefasConcluidas / (double) totalTarefas) * 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Projeto: ").append(nome).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Progresso: ").append(calcularProgresso()).append("%\n");
        sb.append("Tarefas:\n");
        for (Tarefa tarefa : listaTarefas) {
            sb.append(tarefa.toString()).append("\n");
        }
        return sb.toString();
    }
}
