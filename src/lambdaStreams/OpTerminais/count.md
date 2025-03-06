# Operação Terminal: count
A operação terminal `count()` é utilizada para contar a quantidade de elementos em uma stream. 
É uma operação bem simples, mas extremamente útil para determinar o tamanho de um conjunto de dados após aplicar operações intermediárias, como filtragem, mapeamento ou outras transformações.

```java
var numbers = Array.asList(1, 8, 6, 4, 9, 7, 2, 5);

var totalElements = numbers.stream()
        .map(number -> number * 3) // multiplicação por 3 a cada elemento
        .filter(number -> number > 20) // elementos, > 20 após a multiplicação
        .count();

System.out.println(totalElements); // 3
```

```java
var clients = Mock.clients(); // total de clientes: 12

var result = clients.strea,()
        .filter(client -> client.getName().toUpperCase.startsWith("MA")) // nomes de clientes que começam com 'MA'
        .count();

System.out.println(result); // 4
```