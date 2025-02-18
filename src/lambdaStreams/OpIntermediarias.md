# Operações Intermediárias
São operações que transformam uma stream em outra, permitindo criar pipelines de processamento de dados. Elas são "preguiçosas", somente são executadas apenas quando uma operação terminal é invocada.

```java
var names = Array.asList("Ruan", "Patrick", "Hyan", "Daniel", "Johnny", "Carlos")

// Usando a Strem API para transformar, filtrar e coletar resultados
var limitedFilteredNames = name.stream()
	.filter(name -> name.contains("a")) // Filtrando nomes que possuem a letra 'a'
	.map(String::toUpperCase)           // Convertendo para letras maiusculas
	.sorted()                           // Ordenando os nomes por ordem alfabética
	.limit(4)                           // Limitando aos 4 primeiros nomes
	.collect(Collectors.toList());      // Coletando o resultado dem uma nova lista

System.out.println(limitedFilteredNames); // [CARLOS, DANIEL, HYAN, PATRICK]
```
## Principais Operações Intermediárias
As principais operações intermediárias da Streams API são:
- filter
  - Filtra elementos de uma stream com base em um predicado (função que retorna um booleano).
- map
  - Aplica uma função a cada elemento da stream, transformando-os em novos elementos.
- flatMap
  - Transforma cada elemento de uma stream em uma nova stream e concatena todas as streams gerados em uma única stream.
- distinct
  - Remove elementos duplicads da stream.
- sorted
  - Ordena elementos da stream. Pode ser usada sem parâmetros para ordenação natural ou com um comparador personalizado.
- peek
  - Permite realizar ações em cada elemento da stream sem modificá-la.
- limit
  - Retorna uma stream com um número máximo de elementos.
- skip
  - Retorna um stream ignorando os primeiros 'n' elementos.