O _Pattern Matching_ permite verificar a estrutura de um objeto e extrair informações de forma mais concisa e segura.
Ao invés de utilizar várias instruções para verificar o tipo de um objeto e realizar operações específicas, é possível combinas esses passos em uma única operação.

Algumas vantagens de utilizar o _Pattern Matching_ para `Instanceof`: 
- Código mais conciso, evitando a repetição de `cast` explícito
- Segurança de tipo, previnindo erros comuns de _casting_, já que a verificação e o `cast` são combinados.

**EXEMPLO _SEM_ PATTERN MATCHING** 
_cast_ explícito:

```java
public static void printLenght(Object obj) {
    if (obj instanceof String) { // verificando se obj é da instancia String
        var str = String obj; // casting -> transforma obj em string

        System.out.println(str.lenght()); // imprime o tamanho da string
        
    } else if (obj instanceof List<?>) { // se o obj for uma lista
        var list = (List) obj; // casting -> transforma obj em lista

        System.out.println(list.size()); // imprime tamanho da lista
        
    }
}
// main
import java.util.List;

public static void main(String[] args) {
    printLenght("Pedro"); // 5
    printLenght(List.of(1, 3, 5, 7, 9, 11, 13, 15)); // 8
}
```

**EXEMPLO _COM_ PATTERN MATCHING**
_cast_ implícito

```java
public static void printLenght(Object obj) {
    if (obj instanceof String str) { // verificando se obj é da instancia String + // casting implicito com criação de variavel(str) -> transforma obj em string
        System.out.println(str.lenght()); // imprime o tamanho da string
        
    } else if (obj instanceof List<?> list) { // verificando se o obj é uma lista + casting implicito com criação de variavel(list) -> transforma obj em lista
        System.out.println(list.size()); // imprime tamanho da lista
        
    }
}
// main
import java.util.List;

public static void main(String[] args) {
    printLenght("Pedro"); // 5
    printLenght(List.of(1, 3, 5, 7, 9, 11, 13, 15)); // 8
}
```