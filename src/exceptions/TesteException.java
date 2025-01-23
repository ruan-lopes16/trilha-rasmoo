package exceptions;

public class TesteException {
    public static void main(String[] args) {

        // fazendo tratamento de erros
        try { // tente fazer... (TUDO QUE QUERO FAZER E QUE PODE DAR ERRO)
            int resultado = 5 / 0;
            System.out.println( "O resultado é: " + resultado );

        } catch ( ArithmeticException ex ) { // pegue esse erro (tipo de erro que quero tratar + nome de variavel para o erro) - variavel faz referência do tipo ArithmeticException
            System.out.println( "O motivo do erro foi: " + ex.getMessage() );   // pego a mensagem do erro

        }

        // após tentativa de fazer a divisao, o restante do código não é interrompido - segue o fluxo
        System.out.println( "Opa! Agora vou ser chamado!" );
    }
}
