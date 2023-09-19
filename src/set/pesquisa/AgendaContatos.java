package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome))
                contatoPorNome.add(c);
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContato = new AgendaContatos();

        System.out.println("Exibir contatos: ");
        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Jose", 123456);
        agendaContato.adicionarContato("Jose", 0);
        agendaContato.adicionarContato("Jose Silva", 111111);
        agendaContato.adicionarContato("Jose DIO", 678977);
        agendaContato.adicionarContato("Jose Maria", 111111);

        System.out.println("Exibir contatos: ");
        agendaContato.exibirContatos();

        System.out.println("Pesquisar por nome: " + agendaContato.pesquisarPorNome("Jose Maria"));
        System.out.println("Contato Atualizado: " +
                agendaContato.atualizarNumeroContato("Jose Maria", 5555555));
        System.out.println("Exibir contatos: ");
        agendaContato.exibirContatos();
    }
}


















