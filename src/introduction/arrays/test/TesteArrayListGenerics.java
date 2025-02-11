package introduction.arrays.test;

import introduction.arrays.model.Produto;

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
        System.out.println( lista.get(0) ); // lista.get(int index) // arrays.model.Produto@6acbcfc0 - primeira posição

        Produto celular = lista.get(0);
        // exibindo nome e preço
        System.out.println(celular.getNome());
        System.out.println(celular.getPreco());

        // remover registro
        lista.remove(2);    // lista.remove(int index); // do indice 2 (3° posição)

        // tamanho do ArrayList
        System.out.println( "Tamanho do Array: " + lista.size() );

        // remover todos os registros
        // lista.clear(); -> tirar `//` para dar clear

        // verificar se array está vazio
        System.out.println(lista.isEmpty());

        // "toString" -> ref's em memória em cada posição
        System.out.println(lista);

    }
}
