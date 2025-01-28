package pacotes.com.rasmoo.curso.banco.test;

import pacotes.com.rasmoo.curso.banco.model.*;

public class TesteException {
    public static void main(String[] args) {

        // TROQUE OS COMENTARIOS PARA TESTAR AS EXCEPTIONS

        // fazendo tratamento de erros
        try { // tente fazer... (TUDO QUE QUERO FAZER E QUE PODE DAR ERRO)
            // int resultado = 5 / 0;   // estoura ArithmeticException
            int resultado = 10 / 2;     // não estoura ArithmeticException
            System.out.println( "O resultado é: " + resultado );

            Cliente cliente = new Cliente( "Ruan", "147258369 ");
            Conta conta = new Conta(3242, 8732, cliente) {
                @Override
                public void gerarExtrato() {

                }
            };
            conta.depositar( 1000 ); // estoura NullPointerException, pois Conta não foi instanciada(new)
            // conta.sacar( 1000 );
            conta.sacar( 1100 ); // estoura exception "Saldo insuficiente!"

            System.out.println( "O saldo da minha conta é: R$" + conta.getSaldo() );


/*            ArithmeticException arithmeticException = new ArithmeticException( "Deu ruim!" );  // chamando construtor de uma exception + msg
            // lançando exception
            throw arithmeticException;  // força o código a lançar essa exceção, ou seja, cair no catch

            // OU de forma "compacta"
            throw new ArithmeticException( "Deu ruim!" );
            */

        } catch ( RuntimeException ex ) {
            System.out.println( "O motivo foi: " + ex.getMessage() );

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
