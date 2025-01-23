# Exceptions

São erros que podem ser esperados ou erros inesperados que acontecem durante a execução do código.
Podem ser vantajosos(quando forçamos, por fazer parte do negócio), mas nem sempre é algo que estamos esperando, por talvez ter passado despercebido.

- NullPointerException - não consegue invocar método. pois a variável é nula (null)
- ArithmeticException - erro ao executar operações aritméticas

## COMO TRATAR OS ERROS?
Esses erros normalmente são objetos, ou seja, posso acessa os comportamentos colocando.(ponto) após a variável que foi criada
### try-catch
Eu tento fazer determinado código que pode dar erro e logo em seguida caso dê o erro, estoura uma mensagem e coleto essa mensagem e exibo ao usuário sem interromper o fluxo do código

```java
// fazendo tratamento de erros
        try {   // tente fazer... (TUDO QUE QUERO FAZER E QUE PODE DAR ERRO)
            int resultado = 5 / 0;
            System.out.println( "O resultado é: " + resultado );

        } catch ( ArithmeticException ex ) {    // pegue esse erro (tipo de erro que quero tratar + nome de variavel para o erro) - variavel faz referência do tipo(ojeto) ArithmeticException
            System.out.println( "O motivo do erro foi: " + ex.getMessage() );   // pego a mensagem do erro

        }

        // após tentativa de fazer a divisao, o restante do código não é interrompido - segue o fluxo
        System.out.println( "Opa! Agora vou ser chamado!" );
```
**VANTAGEM**
Quero lançar esse erro para em algum momento recuperá-lo e devolver ao usuário.
