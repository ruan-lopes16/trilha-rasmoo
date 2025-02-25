# Operação Intermediária: limit
A operação intermediária `limit` é utilizada para restringir o número de elementos em uma stream. 
Basicamente, ela cria uma nova stream que contém uma quantidade específica de elementos da stream original. 
A função recebe um número como argumento, que representa o máximo de elementos que serão incluídos na nova stream.

```java
var numbers = Array.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

var limitedNumbers = numbers.stream()
        .limit(3)
        .collect(Collector.toList());
System.out.println(limitedNumbers); // [1, 2, 3]
```