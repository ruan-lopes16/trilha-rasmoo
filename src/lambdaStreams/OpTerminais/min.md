# Operação Terminal: min
A operação terminal `min` é utilizada para encontrar o menor elemento de uma stream de acordo com um comparador fornecido. 
Essa operação espera receber um _Comparator_ como argumento, que define a ordem dos elementos para determinar o menor. 
Além disso, ela retorna um _Optional_, pois a stream pode estar vazia, e neste caso, não há um valor mínimo para ser retornado.

```java
var numbers = Array.asList(9, 3, 6, 2, 8, 3, 8, 1);

var minNumber = numbers.stream()
        .min(Integer::compareTo);

System.out.println(minNumber); // Optional[1]
minNumber.ifPresent(System.out::println); // 1
```