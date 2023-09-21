package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatoMap = new AgendaContatos();

        System.out.println("Exibir contatos: ");
        agendaContatoMap.exibirContatos();

        agendaContatoMap.adicionarContato("Jose", 123456);
        agendaContatoMap.adicionarContato("Jose", 0);
        agendaContatoMap.adicionarContato("Jose Silva", 111111);
        agendaContatoMap.adicionarContato("Jose DIO", 678977);
        agendaContatoMap.adicionarContato("Jose Maria", 111111);

        System.out.println("Exibir contatos adicionados: ");
        agendaContatoMap.exibirContatos();
/*
        System.out.println("Pesquisar por nome: " + agendaContatoMap.pesquisarPorNome("Jose Maria"));

        System.out.println("Contato Atualizado: " +
                agendaContatoMap.atualizarNumeroContato("Jose Maria", 5555555));
        System.out.println("Exibir contatos: ");
        agendaContatoMap.exibirContatos();
         */
    }
}
