package introduction.conhecendo;

public class VariaveisNumericasFlutuantes {
    public static void main(String[] args) {

        // int salario = 1150.50;   // da erro

        // float - 32 bits
        // double - 64 bits

        double nota1 = 10;
        double nota2 = 9.5;

        System.out.println("A minha primeira nota foi: " + nota1);
        System.out.println("A minha segunda nota foi: " + nota2);

        double mediaNotas = (nota1 + nota2) / 2;
        System.out.println("A minha média foi de: " + mediaNotas);

        //
        int resultadoDivisao = 15 / 2;    // pegara somente a parte INTEIRA neste caso, pois foi especificado que é um numero INTEIRO ao declarar variavel(int)
        System.out.println(resultadoDivisao);   // 7

        double resultadoDivisaoII = 21.0 / 2;   // preciso colocar pelo menos um dos numeros em ponto flutuante para realmente conhecer que se trata de um double
        System.out.println(resultadoDivisaoII);     // 10.5

    }
}
