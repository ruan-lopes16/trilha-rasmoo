# Operações Terminais
São aquelas que produzem um resultado a partir de uma stream e encerram o pipeline de operações.
Depois que uma operação terminal é invocada, a stream não pode mais ser usada.

```java
var numbers = Array.asList(1, 3, 5, 7, 9);

var sum = numbers.stream()
        .filter(number -> number >= 5)  // Filtrando os número maiores ou iguais a 5
        .map(number -> number * 2)      // Multiplicando cada elemento por 2
        .reduce(0, Integer::sum)        // Combinando os elementos da stream em único resultado

System.out.println(sum);                // 42
```

## Principais Operações Terminais
As principais operações terminais da Streams API são:
- collect
  - Transforma a stream em outro tipo de estrutura, como uma lista, conjunto ou mapa.
- forEach
  - Percorre todos os elementos da stream e executa uma determinada ação para cada elemento.
- reduce
  - Combina todos os elementos da stream em um único resultado.
- count
  - Retorna o número de elementos na stream.
- min
  - Retorna o menor elemento da stream de acordo com o _Comparator_ informado.
- max
  - Retorna o maior elemento da stream de acordo com o _Comparator_ informado.
- findFirst
  - Se existir, retorna o primeiro elemento da stream.
- anyMatch
  - Retorna `true` se qualquer elemento da stream corresponder ao predicado informado.
- allMatch
  - Retorna `true` se todos elementos da stream corresponder ao predicado informado.
- nomeMatch
- Retorna `true` se nenhum elemento da stream corresponder ao predicado informado.