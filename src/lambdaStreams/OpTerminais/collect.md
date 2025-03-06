# Operação Terminal: collect
A operação terminal `collect` é utilizada para transformar os elementos de uma stream em outra estrutura de dados, como listas, mapas ou concatenar os elementos em uma única string. 
A função aceita um `Collector` como argumento, que é uma _interface funcional_  que descreve como transformar uma stream em outro tipo de dado. 
Essa operação é altamente flexível e pode ser personalizada através da utilização da classe utilitária `Collectors`, que fornece diversas implementações comuns de Collector.

```java
var names = Arrays.asList("Pedro", "Ana", "Marcos", "Vanessa");

var filteredNames = names.stream()
        .filter(name -> name.length() >= 6)
        .collect(Collectors.toList());

System.out.println(filteredNames); // [Marcos, Vanessa]
```