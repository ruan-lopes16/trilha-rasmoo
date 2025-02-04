package arrays.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
    }
}
