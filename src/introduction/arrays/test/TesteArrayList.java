package introduction.arrays.test;

import introduction.arrays.model.Produto;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        // inicializando um ArrayList
        ArrayList lista = new ArrayList();

        // criando produtos
        Produto p1 = new Produto( "Celular", 1999.9 );
        Produto p2 = new Produto( "Geladeira", 2499 );
        Produto p3 = new Produto( "Notebook", 3000);

        // adicionando valores à um ArrayList - lista
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        // acessando REFERENCIAS
        // lista.get(int index)
        System.out.println( lista.get(0) ); // arrays.model.Produto@6acbcfc0 - primeira posição

        // fazendo introduction.conhecendo.Casting - "descendo" hierarquia para ter acesso aos metodos de Produto
        Produto celular = (Produto) lista.get(0);
        // exibindo nome e preço
        System.out.println(celular.getNome());
        System.out.println(celular.getPreco());

    }
}
