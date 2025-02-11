package introduction.conhecendo;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        // while -> se repete até que algo aconteça
        System.out.println("-----WHILE-----");

        int contador = 0;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;     // contador = contador + 1;     ou      contador += 1;
        }

        // do-while -> faça... enquanto... testa pelo menos uma vez, para depois fazer a verificação se continua ou para
        System.out.println("\n-----DO WHILE-----");

        int c = 0;

        do {
            System.out.println(c);
            c++;

        } while (c <= 5);

        // for
        System.out.println("\n-----FOR-----");

        for (int count = 0; count <= 5; count++) { // inicialização; condição; incremento/decremento
            System.out.println(count);
        }
    }
}
