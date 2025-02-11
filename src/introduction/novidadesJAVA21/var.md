## var
o var é uma palavra-chave que foi introduzida como parte do recurso de *Local Variable Type Inference*.
Ele permite ao compilador inferir automaticamente o tipo da variável com base no valor atribuído.
Dessa forma, substitui a necessidade de declarar explicitamente o tipo da variável. simplificando o código e tornando-o mais limpo e fácil de manter.

```java
var age = 32;                                   // o tipo inferido é int
var name = "Ruan";                              // o tipo inferido é String
var product = new Product("Celular", 5000);     // o tipo inferido é Product
```

Quando utilizar `var`?
Posso usar em variáveis locais, dentro de blocos de código, loop etc.

Quando NÃO utilizar?
Ao declarar parâmetros, atributos de classe e para variáveis que não recebem valor.
```java 
// passagem de parametros
public void depositar(var valor) {  // `var valor` ERRADO
    // codigo
}
```

```java
// atributos de classe
private var nome;   // ERRADO
```

```java
var sobrenome;  // ERRADO
```