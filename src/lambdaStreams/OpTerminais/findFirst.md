# Operação Terminal: findFirst
A operação terminal `findFirst()` é utilizada para retornar o primeiro elemento de uma stream. 
Esta operação é particularmente útil quando precisamos obter o primeiro elemento que atenda a uma determinada condição após aplicar operações intermediárias como filtragem, mapeamento, entre outras. 
A função retorna um _Optional_, que pode conter o primeiro elemento encontrado ou estar vazio se a stream não tiver nenhum elemento.

```java
var numbers = Arrays.asList(9, 3, 6, 2, 8, 3, 7, 8, 1);

var firstEven = numbers.stream()
        .filter(num -< num % 2 == 0)
        .sorted()
        .findFirst();

System.out.println(firstEven); // Optional[2]
firstEven.ifPresent(System.out::println); // 2
```