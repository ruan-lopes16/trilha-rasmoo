# Exceptions

São erros que podem ser esperados ou erros inesperados que acontecem durante a execução do código.
Podem ser vantajosos(quando forçamos, por fazer parte do negócio), mas nem sempre é algo que estamos esperando, por talvez ter passado despercebido.

- NullPointerException - não consegue invocar método. pois a variável é nula (null)
- ArithmeticException - erro ao executar operações aritméticas

## COMO TRATAR OS ERROS?
Esses erros normalmente são objetos, ou seja, posso acessar os comportamentos colocando .(ponto) após a variável que foi criada

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

### multi-catch
Multi-catch nada mais é que um "encadeamento" de catch, assim tornando possível tratar várias exceções
```java
// fazendo tratamento de erros  
try { // tente fazer... (TUDO QUE QUERO FAZER E QUE PODE DAR ERRO)  
    int resultado = 5 / 0;   // estoura ArithmeticException  
    System.out.println( "O resultado é: " + resultado );  
  
    Conta conta = null;  
    conta.depositar( 1000 ); // estoura NullPointerException, pois Conta não foi instanciada(new)  
    System.out.println( "O saldo da minha conta é: R$" + conta.getSaldo() );  

	
} catch ( ArithmeticException ex ) { // pegue esse erro (tipo de erro que quero tratar + nome de variavel para o erro) - variavel faz referência do tipo ArithmeticException  
    System.out.println( "O motivo do erro foi: " + ex.getMessage() );   // pego a mensagem do erro  
} catch ( NullPointerException ex ) {  
    System.out.println( "Ocorreu um NullPointer. O motivo foi: " + ex.getMessage() );  
}
```

### finally
Todo código dentro desse bloco finally será executado, independentemente de estourou exceção ou não

```java
finally {
    System.out.println( "Esse bloco sempre será executado." );
}
```

**VANTAGENS**
Serve para fazer um "encerramento" no código.

### LANÇANDO EXCEÇÕES (throw)
Gerar erro e jogar na pilha de execução

-> Lançando exceção do tipo: ArithmeticException
```java
ArithmeticException arithmeticException = new ArithmeticException( "Deu ruim!" );  // chamando construtor de uma exception + msg
// lançando exception
throw arithmeticException;  // força o código a lançar essa exceção, ou seja, cair no catch
```
Existe uma forma mais compacta e direto de fazer isso:
```java
throw new ArithmeticException( "Deu ruim!" );
```

Como comentado, me possibilita fazer o lançamento dessa exceção, em outras palavras faz cair no catch

*RuntimeException*
CLASSE genérica de **Exceptions**, pois ela mãe de todas as outras **Exceptions**
```java
// Conta.java
void sacar ( double valor ) {
    if ( this.saldo < valor ) {
            throw new RuntimeException( "Saldo insuficiente!" );    // tudo o que vier após esse erro não será chamado
    }

    this.saldo -= valor;
}
```

```java
// TesteException.java (main)
catch ( RuntimeException ex ) {
    System.out.println( "O motivo foi: " + ex.getMessage() );

    }
```

Ao exeutar meu `main` e cair em qualquer **`Exception`** que seja, vai me retornar uma mensagem de erro da respectiva classe da **`Exception`**, como exemplo pode retornar mensagem de "ArithmeticException", "NullPointerException", etc. 