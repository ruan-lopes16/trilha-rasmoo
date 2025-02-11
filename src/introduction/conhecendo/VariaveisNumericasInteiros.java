package introduction.conhecendo;

public class VariaveisNumericasInteiros {

    public static void main(String[] args) {
        // inicializando variaveis inteiras
        int idadeRuan; // declarando
        idadeRuan = 21; // fazendo inicialização

        System.out.println("A idade de Ruan é " + idadeRuan + " anos");

        // ou
        int idadeRafa = 15;
        System.out.println(idadeRafa);

        // de acordo com tipo, maior o range
        // byte - 8 bits = -128 até 127
        // short - 16 bits = -32768 até 32767
        // int - 32 bits = ...
        // long - 64 bits = ...


        byte testaByte = 127;
        // byte testaByte = 128; //  da erro, pois é um número maior do que essa variavel suporta, nesse caso poderia ser o short
        short testaByte2 = 128;

        // tipos para armazenar expressões
        int testaExpressao = 10 * 5 + 50 + 24 / 2;
        System.out.println("O resultado da expressão: 10 * 5 + 50 + 24 / 2 é: " + testaExpressao);

    }
}
