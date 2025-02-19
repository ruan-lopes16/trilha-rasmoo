# Operação Intermediária: peek
A operação intermediária `peek` é utilizada para inspecionar cada elemento de uma stream enquanto ela está sendo processada. 
Essa operação aceita um _Consumer_, uma função que recebe um único argumento e não retorna nenhum resultado. 
Normalmente, é usada para depuração ou log de dados em diferentes estágios do pipeline, pois permite executar uma ação em cada elemento da stream sem modificá-los.

```java
var numbers = Array.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

var result = numbers.stream()
        .map(number -> number * 2)
        .peek(number -> System.out.println("After Map: " + number))     // 2, 4, 6, 8, 10, 12, 14, 16, 18
        .filter(number -> number > 8)
        .peek(number -> System.out.println("After Filter: " + number))  // 10, 12 ,14, 16, 18
        .collect(Collectors.toList());

System.out.println(result);     // [10, 12 ,14, 16, 18]
```