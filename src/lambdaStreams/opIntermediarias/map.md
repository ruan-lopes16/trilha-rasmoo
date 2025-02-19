# Operação Intermediária: map
A operação intermediária `map` é utilizada para transformar os elementos de uma stream. 
Ela recebe uma função como argumento e essa função é aplicada a cada elemento da stream, retornando um novo elemento, que pode ser de um tipo diferente do original. 
O resultado é uma nova stream composta pelos elementos transformados.

```java
var names = Array.asList("Pedro", "Ana", "Marcos", "Vanessa");

var upperCaseNames = names.stream() // Stream<String>
        .map(String::toUpperCase)   // Stream<String>
        .collect(Collectors.toList());
System.out.println(upperCaseNames); // [PEDRO, ANA, MARCOS, VANESSA]
```

```java
var names = Array.asList("Pedro", "Ana", "Marcos", "Vanessa");

var lengthNames = names.stream() // Stream<String>
        .map(String::length) // Stream<Integer>
        .collector(Collectors.toList());
System.out.println(lengthNames); // [5, 3, 6, 7]
```