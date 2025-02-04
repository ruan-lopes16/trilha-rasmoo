package arrays.test;

import arrays.model.Produto;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        // inicializando um ArrayList de Produto(generics)
        ArrayList<Produto> lista = new ArrayList();

        // criando produtos
        Produto p1 = new Produto( "Celular", 1999.9 );
        Produto p2 = new Produto( "Geladeira", 2499 );
        Produto p3 = new Produto( "Notebook", 3000);
        Produto p4 = new Produto( "Notebook", 3000);

        // adicionando valores a um ArrayList - lista
        lista.add(p1); // 0
        lista.add(p2); // 1
        lista.add(p3); // 2
        // p4 não foi adicionado

        System.out.println(lista.contains(p4));
        // método booleano q verifica se o que passamos como parametro, existe no ArrayList

        System.out.println(lista.indexOf(p4));
        // me retorna a posição do objeto passado -> caso não exista retorna -1

        System.out.println("Ref p3: " + p3);
        System.out.println("Ref p4: " + p4);
        // mesmos atributos, porém alocações em memória são diferentes, pois cada um é um objeto

        if (p3 == p4) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        // equals
        if (p3.equals(p4) ) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }


    }
}
