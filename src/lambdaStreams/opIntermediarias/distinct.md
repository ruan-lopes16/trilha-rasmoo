# Operação Intermediária: distinct
A operação intermediária `distinct()` é utilizada para eliminar elementos duplicados de uma stream, garantindo que cada elemento no resultado seja único. 
Além disso, é utilizada a implementação do método `equals` dos elementos da stream para determinar o critério de unicidade.

```java
var numbers = Array.asList(1, 2, 3, 2, 5, 1, 6);

var distinctNumbers = numbers.stream()
        .distinct()
        .collect(Collectors.toList());

System.out.println(distinctNumbers); // [1, 2, 3, 5, 6]
```

```java
public boolean equals(Object obj) {
    if (obj instanceof Integer) {
        return value == ((Integer)obj).intValue();
    }
    return false;
}
```