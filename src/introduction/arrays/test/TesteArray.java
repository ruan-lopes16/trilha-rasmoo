package introduction.arrays.test;

public class TesteArray {
    public static void main(String[] args) {

        //  |0.0|0.0|0.0|
        double[] precos = new double[3];

        // atribuindo valores ao array
        // ultimo índice do array = tam. dele - 1
        precos[0] = 4999.9;     // primeira posição
        precos[2] = 3999.9;     // ultima posição

        System.out.println("Conteúdo 1° posição do ARRAY: " + precos[0]);      // acessando primeira posição

        // acessando posições de um array
        for ( int i = 0; i < precos.length; i++ ){
            System.out.println(precos[i]);  // se passa variavel `i`, pois inicia em 0 e vai ser incrementada
        }

    }
}
