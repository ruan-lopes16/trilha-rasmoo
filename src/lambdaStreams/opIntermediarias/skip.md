# Operação Intermediária: skip
A operação intermediária `skip` é utilizada para ignorar os primeiros elementos de uma stream. 
Esta operação é útil quando desejamos descartar uma parte inicial da stream e continuar o processamento com os elementos subsequentes. 
A função recebe um número como argumento, que representa a quantidade de elementos que serão ignorados do início da stream.

```java
var names = Array.asList("Pedro", "Ana", "Marcos", "Vanessa");

var skippedNames = names.stream()
        .skip(2)
        .collect(Collector.toList());
System.out.println(skippedNames); // [Marcos, Vanessa]

```