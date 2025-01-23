package exceptions;

public class TesteException {
    public static void main(String[] args) {

        // fazendo tratamento de erros
        try { // tente fazer... (TUDO QUE QUERO FAZER E QUE PODE DAR ERRO)
            // int resultado = 5 / 0;   // estoura ArithmeticException
            int resultado = 10 / 2;     // não estoura ArithmeticException
            System.out.println( "O resultado é: " + resultado );

            Cliente cliente = new Cliente( "Ruan", "147258369 ");
            Conta conta = new Conta(3242, 8732, cliente );
            conta.depositar( 1000 ); // estoura NullPointerException, pois Conta não foi instanciada(new)

            System.out.println( "O saldo da minha conta é: R$" + conta.getSaldo() );

        }
        // PARA NAO PRECISAR "ENCADEAR" CATCH's
        catch ( NullPointerException | ArithmeticException ex ) {
            System.out.println( "Ocorreu um NullPointer. O motivo foi: " + ex.getMessage() );

        } finally {
            System.out.println( "Esse bloco sempre será executado." );

        }

        /*catch ( ArithmeticException ex ) { // pegue esse erro (tipo de erro que quero tratar + nome de variavel para o erro) - variavel faz referência do tipo ArithmeticException
            System.out.println( "O motivo do erro foi: " + ex.getMessage() );   // pego a mensagem do erro

        } catch ( NullPointerException ex ) {
            System.out.println( "Ocorreu um NullPointer. O motivo foi: " + ex.getMessage() );

        }
         */

        // após tentativa de fazer a divisao, o restante do código não é interrompido - segue o fluxo
        System.out.println( "Opa! Agora vou ser chamado!" );
    }
}
