# Operação Intermediária: flatMap
A operação intermediária `flatMap` é utilizada para transformar cada elemento de uma stream em uma nova stream e, em seguida, "achatar" os resultados em uma única stream. 
Ela recebe uma função, como argumento, que transforma cada elemento da stream original em uma nova stream. 
Em seguida, essas streams geradas são concatenadas em uma única stream.

```java
var listOfLists = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5, 6),
    Arrays.asList(7, 8, 9),
    Arrays.asList(10, 11, 12)
);

var flatList = listOfLists.stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
System.out.println(flatList); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
```