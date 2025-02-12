O _Pattern Matching_ permite verificar a estrutura de um objeto e extrair informações de forma mais concisa e segura.
Ao invés de utilizar várias instruções para verificar o tipo de um objeto e realizar operações específicas, é possível combinas esses passos em uma única operação.

Algumas vantagens de utilizar o _Pattern Matching_ para `switch`:
- código mais limpo, eliminando a necessidade de diversas verificações de tipo e uso de _casting_
- Menor probabilidade de erros, reduzindo o risco de _casting_ incorreto ou _cases_ não tratados
- Permite adicionar condições específicas nos _cases_
- Facilidade para manter, simples de adicionar novos casos ou alterar os existentes

```java
public static void printTypeAndValue(Object obj) {
    var message = switch (obj) {    // variavel message que recebe o switch como retorno - pego o obj que pode ser qlqr coisa e passo ele para o switch e dentro dele precisarei entender qual o tipo de objeto ( fazendo o casting )
        case long l -> String.format("Long: %d", l);
        case Double d -> String.format("Double %f", d);
        case String s when s.length() > 10 -> "Too large String value...";
        case String s -> String.format("String: %s", s);
        case Integer i -> String.format("Integer: %d", i);
        default -> "Unknown type";
    };
    System.out.println(message);
}
// main
import java.util.List;

public static void main(String[] args) {
    printTypeAndValue(5); // Integer: 5
    printTypeAndValue("Ruan"); // String: Ruan
    printTypeAndValue("Paralelepipedo"); // Too large String value...
    printTypeAndValue(List.of(2, 4, 6 , 8)); // Unknown type
}
```