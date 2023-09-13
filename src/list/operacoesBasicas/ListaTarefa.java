package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefasRemover.add(t);
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");

        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        //listaTarefa.removerTarefa("Tarefa 02");
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}










