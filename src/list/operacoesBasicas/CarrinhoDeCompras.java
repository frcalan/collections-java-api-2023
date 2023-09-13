package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {this.itemList = new ArrayList<>(); }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome))
                    itensParaRemover.add(item);
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras  = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item 1", 200, 10);
        carrinhoDeCompras.adicionarItem("Item 2", 800, 5);
        carrinhoDeCompras.adicionarItem("Item 3", 500, 10);
        carrinhoDeCompras.exibirItens();
        System.out.println("Total : "+ carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Item 1");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Item 4", 150, 5);
        carrinhoDeCompras.exibirItens();
        System.out.println("Total : "+ carrinhoDeCompras.calcularValorTotal());
    }
}
