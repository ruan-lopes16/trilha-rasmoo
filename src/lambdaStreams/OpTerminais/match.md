# Operação Terminal: noneMatch
A operação terminal `noneMatch` é utilizada para verificar se nenhum elemento de uma stream atende a uma determinada condição. 
Basicamente, ela retorna “true” se não houver elementos na stream que satisfaçam o predicado fornecido; caso contrário, retorna false. 
Essa operação recebe como argumento um Predicate, que é uma função que retorna um booleano (true ou false) para um dado elemento da stream.

```java
var numbers = Arrays.asList(1, 2, 3, 4, 5);
var noneNegative = numbers.stream()
        .nomeMatch(number -> number < 0);
System.out.println(noneNegative); // true
```

# Operação Terminal: anyMatch
A operação terminal “anyMatch” é utilizada para verificar se algum elemento de uma stream atende a uma determinada condição. 
Basicamente, ela retorna “true” se houver pelo menos um elemento que satisfaça o predicado fornecido; caso contrário, retorna false. 
Essa operação recebe como argumento um Predicate, que é uma função que retorna um booleano (true ou false) para um dado elemento da stream.

```java
var numbers = Arrays.asList(1, 3, 5, 7, 8);
boolean anyEven = numbers.strem()
        .anyMatch(num -> num % 2 == 0);
System.out.println(anyEven); // true
```

# Operação Terminal: allMatch
A operação terminal “allMatch” é utilizada para verificar se todos os elemento de uma stream atendem a uma determinada condição. 
Basicamente, ela retorna “true” se todos os elementos satisfizerem o predicado fornecido; caso contrário, retorna false. 
Essa operação recebe como argumento um Predicate, que é uma função que retorna um booleano (true ou false) para um dado elemento da stream.

```java
var numbers = Arrays.asList(1, 3, 5, 7, 9, 11);
var allOld = numbers.stream()
        .allMatch(num -> num > 0);
System.out.println(allOld); // true
```