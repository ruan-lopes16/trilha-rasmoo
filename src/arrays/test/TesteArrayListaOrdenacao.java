package arrays.test;

import arrays.model.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListaOrdenacao {
    public static void main(String[] args) {
        // criando arraylist
        ArrayList<String> nomes = new ArrayList<>();

        // adicionando valores
        nomes.add("Ruan");
        nomes.add("Patrick");
        nomes.add("Daniel");
        nomes.add("Johnny");

//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }

            /* antes
            Ruan
            Patrick
            Daniel
            Johnny
            */

        System.out.println("----------------NOMES----------------");
        // deixando em ordem alfabética A-Z
        Collections.sort(nomes);
        for (String nome:nomes) { // para cada nome do array, faça -> tipo variavel: array
            System.out.println(nome);
        }
            /* depois
            Daniel
            Johnny
            Patrick
            Ruan
            */

        System.out.println("----------------PRODUTOS----------------");
        // criando arraylist de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // criando produtos
        Produto p1 = new Produto("Celular", 1999.9);
        Produto p2 = new Produto("Geladeira", 2499);
        Produto p3 = new Produto("Notebook", 3000);
        Produto p4 = new Produto("Armário", 15000);

        // adicionando produto ao array
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        System.out.println("         ORDENAÇÃO ALFABÉTICA");
        Collections.sort(produtos);

        // foreach para percorrer a lista de produtos
        for (Produto produto: produtos) {
            // System.out.println(produto); // assim me retorna as referencias em memoria
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
        System.out.println("----------------------------------------");

        System.out.println("             ORDENAÇÃO PREÇO");
        Collections.sort(produtos, new PrecoProdutoComparator());
        //OU
        // produtos.sort(new PrecoProdutoComparator());

        for (Produto produto: produtos) {
            // System.out.println(produto); // assim me retorna as referencias em memoria
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
// implementando classe para fins de comparação  de preco do Produto
class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
//       if (p1.getPreco() > p2.getPreco()) {
//           return 1;
//       }
//       if (p2.getPreco() < p2.getPreco()) {
//           return -1;
//       }
//       return 0;
        return (int) (p1.getPreco() - p2.getPreco()); // fazendo casting para inteiros
    }
}
