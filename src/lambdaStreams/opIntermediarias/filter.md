# Operação Intermediária: filter
A operação intermediária `filter` é utilizada para selecionar elementos de uma stream que satisfazem um determinado predicado.
O predicado é uma função que recebe um argumento e retorna um resultado booleano. Apenas os elementos para os quais o predicado retornar verdadeiro que serão mantidos na stream resultante

```java
var names = Array.asList("Ruan", "Patrick", "Hyan", "Daniel", "Johnny", "Carlos");

var filteredNames = names.stream()
        .filter(names -> name.lenght() >= 6)
        .collect(Collectors.toList());
System.out.println(filteredNames); // [Patrick, Daniel, Jonhhy, Carlos]
```