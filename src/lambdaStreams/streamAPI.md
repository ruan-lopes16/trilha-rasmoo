# Stream API
A Streams API foi introduzida no Java 8 e faz parte do pacote `java.util.stream`. Ela tem como objetivo fornecer uma maneira funcional e declarativa de manipular coleções de dadps.
Assim, permite realizar operações como filtrar, mapear, reduzir, coletar etc, sobre sequências de elementos de uma maneira fácil de ler.

```java
var names = Array.asList("Ruan", "Patrick", "Hyan", "Daniel", "Johnny", "Carlos");

// Usando a Streams API para transformar, filtrar e coletar resultados
var filteredNames = names.stream()  // `names` não é alterada
	.filter(name -> name.startsWith("R"))  // Filtrando nomes que começam com a letra "R"
	.map(String:::toUpperCase)  // Convertendo para letras maiúsculas
	.collect(Collector.toList());  // Coletando o resultado em uma nova lista

System.out.println(filteredNames);  // [Ruan]
```

## Características da Streams API
As principais características são:

- **Operações de Alta Ordem**: Suporta operações que podem receber outras funções como argumentos ou retornar funções como resultado. Ex.: `map`, `filter` e `reduce`.
- **Imultabilidade**: As operações de stream não alteram os dados originais. Elas produzem novos streams, permitindo uma programação imutável.
- **Sem efeitos colaterais**: As funções aplicadas nas streams devem ser puras. O resultado depende apenas de seus valores de entrada e não devem alterar o estado do programa ou interagir com o mundo externo.
- **Expressividade e Composição**: Permite a composição de operações complexas de forma conscisa, legível e de fácil entendimento.
- **Avaliação Preguiçosa**: As operações intermediárias são avaliadas somente quando uma operação terminal é invocada, melhorando a eficiência ao evitar cálculos desnecessários.

## Estrutura de uma Stream
Uma stream consiste em três partes principais, que juntas permitem a manipulação de coleções de dados de maneira eficiente e concisa.

- Fonte (Source)
  - A fonte de uma stream é a coleção de dados da qual a stream é criada. Ela pode ser uma coleção como `List`, `Set`, `Map` ou um `Array`. Dessa forma, é possível obter uma stream de uma coleção usando o método `stream()`.
  ```java
  var names = Arrays.asList("Ruan", "Patrick", "Hyan", "Daniel", "Johnny", "Carlos");
  
  Stream<String> filteredNames = names.stream();
  ```

## Operações Intermediárias(_Intermediate Operations_)
- Transforam uma stream em outra stream.
  - São encadeadas e são preguiçosamente avaliadas(_Lazy Evaluation_).
  - Não são executadas até que uma operação terminal seja invocada.
- Ex.:
  - `filter`: Filtra elementos de acordo com um predicado.
  - `map`: Transforma elemetentos com base em uma função.
  
  ```java
  var numbers = Array.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
  // Usando a Strem API para transformar, filtrar e coletar resultados
  var filteredNumbers = numbers.stream()
      .filter(number -> number % 2 == 0)  // FIltrando todos os números pares
      .map(Integer::toBinaryString)   // Conversão para número binário
      .collect(Collector.toList());   // Coleta o resultado em uma nova lista
    
  System.out.println(filteredNumbers);    // [10, 100, 110, 1000, 1010]
  ```
    
## Operações Terminais (_Terminal Operations_)
- As operações terminais produzem um resultado final ou um efeito colateral. Após sua execução, a stream é considerada consumida e não pode ser reutilizada.
- Ex.:
  - `collect`: Coleta os elementos da stream em uma nova coleção.
  - `allMatch`: Verifica se todos os elementos da stream atendem a um predicado
  
```java
var numbers = Array.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

var isNumbersLowerThan10 = numbers.stream()
    .allMatch(number -> number < 10);

System.out.println(inNumbersLowesThan10); // false
```