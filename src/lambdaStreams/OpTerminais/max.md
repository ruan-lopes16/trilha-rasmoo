# Operação Terminal: max
A operação terminal `max` é utilizada para encontrar o maior elemento de uma stream de acordo com um comparador fornecido.
Essa operação espera receber um _Comparator_ como argumento, que define a ordem dos elementos para determinar o maior. 
Além disso, ela retorna um _Optional_, pois a stream pode estar vazia, e neste caso, não há um valor máximo para ser retornado.

```java
var names = Arrays.asList("Pedro", "Ana", "Marcos", "Vanessa");

var biggestName = names.stream()
        .max(Comparator.comparing(String::length));

System.out.println(biggestName); //Optional[Vanessa]
biggestName.ifPresent(System.out::println); // Vanessa
```

```java
var products = Mock.products();
var result = products.stream()
        .max(Comparator.comparing(Product::getPrice));

result.ifPresent(product -> {
    System.out.println("O produto: " + product.getName() + ", custa R$" + product.getPrice())
        }); // O produto: Macbook Pro, custa R$15699.99
System.out.println(Result) // Optional[{name='MacBook Pro', price=15699.99}]
```