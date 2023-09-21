package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty())
            palavras.remove(palavra);
         else
             System.out.println("O Map está vazio.");

    }

    public int exibirContagemPalavras() {
        int contador = 0;
        if (!palavras.isEmpty()) {
            for (int contagem : palavras.values()){
                contador += contagem;
            }
        }
        else {
            System.out.println("O Map está vazio.");
        }
        return contador;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;

        int contador = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > contador) {
                contador += entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemPalavras.adicionarPalavra("Foco", 9);
        contagemPalavras.adicionarPalavra("Persistencia", 8);
        contagemPalavras.adicionarPalavra("Fe", 6);
        contagemPalavras.adicionarPalavra("Forca", 2);
        contagemPalavras.adicionarPalavra("Conquistar", 3);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }
}
