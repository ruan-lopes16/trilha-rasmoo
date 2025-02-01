package arrays.test;

import arrays.model.Produto;

import java.util.ArrayList;

public class TesteArrayListGenerics {
    public static void main(String[] args) {
        // inicializando um ArrayList de Produto(generics)
        ArrayList<Produto> lista = new ArrayList();

        // ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>(); // isso me retorna String e não Object

        // criando produtos
        Produto p1 = new Produto( "Celular", 1999.9 );
        Produto p2 = new Produto( "Geladeira", 2499 );
        Produto p3 = new Produto( "Notebook", 3000);

        // adicionando valores a um ArrayList - lista
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        // acessando REFERENCIAS
        // lista.get(int index)
        System.out.println( lista.get(0) ); // arrays.model.Produto@6acbcfc0 - primeira posição

        Produto celular = lista.get(0);
        // exibindo nome e preço
        System.out.println(celular.getNome());
        System.out.println(celular.getPreco());

    }
}
