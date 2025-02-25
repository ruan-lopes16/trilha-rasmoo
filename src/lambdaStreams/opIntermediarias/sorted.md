# Operação Intermediária: sorted
A operação intermediária `sorted` é utilizada para ordenar os elementos de uma stream. 
Esta operação é útil quando desejamos garantir que os elementos estejam em uma ordem específica antes de realizar operações subsequentes, como mapeamento, filtragem ou coleta.

```java
var names = Arrays.asList("Pedro", "Ana", "Marcos", "Vanessa");

var sortedNames = names.stream()
        .sorted()
        .collect(Collectors.toList());
System.out.println(sortedNames); // [Ana, Marcos, Pedro, Vanessa]
```

Obs.: Comportamento **padrão** de `sorted`: Ordenar em ordem alfabética - com `String`


Essa operação também pode receber _Comparator_ como argumento, que permite uma ordenação customizada dos elementos de uma stream.

```java
var names = Arrays.asList("Pedro", "Ana", "Marcos", "Vanessa");

var sortedNames = names.stream()
        .sorted(Comparator.comparing(String::length))
        .collect(Collectors.toList());
System.out.println(sortedNames); // [Ana, Pedro, Marcos, Vanessa]
                                 // [3, 5, 6, 7]   
```