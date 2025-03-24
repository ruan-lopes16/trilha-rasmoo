# Teste Técnico de Java
## Seção 1: Java Básico
1. Explique a diferença entre **JDK**, **JRE** e **JVM**.

2. O que é um final em Java e como ele pode ser usado?

3. Qual é a diferença entre `==` e `equals()` em Java?

4. O que é um bloco estático em Java e quando ele é executado?

5. Explique o conceito de **overloading** e **overriding** em Java.

---
## Seção 2: Orientação a Objetos
6. Defina encapsulamento e explique como ele é implementado em Java.

7. Explique a diferença entre herança e composição.

8. O que é polimorfismo em Java? Dê um exemplo.

9. Explique o conceito de uma interface em Java.

10. O que são classes abstratas e como elas diferem de interfaces?

---
## Seção 3: Estruturas de Dados
11. O que é um ArrayList e como ele difere de um array?

12. Explique a diferença entre `HashMap` e `TreeMap`.

13. Como você implementaria uma fila usando duas pilhas?

14. O que é um conjunto `(Set)` em Java e quais são suas principais implementações?

15. Explique a complexidade de tempo de busca, inserção e remoção em um HashMap.

---
## Seção 4: Java Streams
16. O que são **Java Streams** e para que são usados?

17. Como você filtra uma lista de números para encontrar apenas os pares usando streams?

18. Qual é a diferença entre `map()` e `flatMap()` em Java Streams?

19. Explique a operação de redução em Java Streams com um exemplo.

20. Como você contaria o número de strings em uma lista que começam com uma letra específica usando streams?

---
## Seção 5: Análise de Código

21. Dado o seguinte código, qual será a saída e por quê?
`
List<string> list = Arrays.asList("a", "b", "c"); 
list.stream().forEach(System.out::println); </string>
`

22. Qual será a saída do seguinte código e por quê?
`
String str = null; Optional<string> optional = Optional.ofNullable(str); 
System.out.println(optional.orElse("default")); </string>
`

23. Dado o seguinte código, qual será a saída e por quê?
`
List<integer> list = Arrays.asList(1, 2, 3, 4, 5); 
    list.stream()
        .filter(i -> i % 2 == 0) 
        .map(i -> i * i) 
        .forEach(System.out::println); </integer>
`

24. Qual será a saída do seguinte código e por quê?
`
List<integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
List<integer> result = numbers.stream() 
    .peek(System.out::println) 
    .filter(n -> n % 2 == 0) 
    .collect(Collectors.toList()); </integer></integer>
`

25. Analise o seguinte código e explique o comportamento.
`
List<string> list = new ArrayList<>(); 
list.add("a"); 
list.add("b"); 
list.add("c"); 
for (String s : list) { 
    if (s.equals("b")) { 
        list.remove(s); 
    } 
} </string>
`

26. O que acontece quando você tenta adicionar um elemento a um List imutável criado com Arrays.asList()?

27. Dado o seguinte código, qual será a saída e por quê?
`
List<string> list = Arrays.asList("apple", "banana", "cherry"); 
list.replaceAll(String::toUpperCase); 
System.out.println(list); </string>
`

28. Qual será a saída do seguinte código e por quê?
`
Map<string, integer=""> map = new HashMap<>(); 
map.put("one", 1); 
map.put("two", 2); 
map.put("three", 3); 
map.computeIfPresent("two", (k, v) -> v + 1); 
System.out.println(map.get("two")); </string,>
`

29. Analise o comportamento do seguinte código.
`
List<integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b); 
System.out.println(sum); </integer>
`

30. Qual será a saída do seguinte código e por quê?
`
List<string> list = Arrays.asList("one", "two", "three"); 
Optional<string> result = list.stream() 
    .filter(s -> s.length() > 3) 
    .findFirst(); 
System.out.println(result.orElse("not found")); </string></string>
`
---
## Seção 6: Questões Avançadas
31. Como você pode garantir que uma coleção é sincronizada?

32. Explique o conceito de Optional em Java e suas vantagens.

33. O que é uma expressão lambda e como ela é usada em Java?

34. Explique o que é um stream paralelo e quando ele deve ser usado.

35. Qual é a diferença entre Collectors.toList() e Collectors.toCollection()?

36. Dado o seguinte código, qual será a saída e por quê?
`
List<string> list = Arrays.asList("a", "bb", "ccc"); 
Map<integer, list<string="">> map = list.stream() 
    .collect(Collectors.groupingBy(String::length)); 
System.out.println(map); </integer,></string>
`

37. Qual é a vantagem de usar a interface `Function` em Java?

38. Explique o conceito de `method reference` em Java.

39. O que são variáveis final locais e por que elas são úteis?

40. Dado o seguinte código, qual será a saída e por quê?
`
List<integer> list = Arrays.asList(1, 2, 3, 4, 5); 
boolean allEven = list.stream() 
    .allMatch(n -> n % 2 == 0); 
System.out.println(allEven); </integer>
`

41. O que é a inferência de tipos em Java e como ela é usada com var?

42. Qual é a diferença entre `Stream.of()` e `Stream.generate()`?

43. Explique a funcionalidade de `Stream.iterate()`.

44. Como você pode evitar modificações em uma coleção imutável?

45. Dado o seguinte código, qual será a saída e por quê?
`
List<integer> list = Arrays.asList(1, 2, 3, 4, 5); 
Optional<integer> result = list.stream() 
    .filter(n -> n > 3) .findAny(); 
System.out.println(result.orElse(0)); </integer></integer>
`

46. Explique a diferença entre `flatMap()` e `map()` com um exemplo.

47. O que são interfaces funcionais e qual a sua importância?

48. Qual será a saída do seguinte código e por quê?
`
List<integer> list = Arrays.asList(1, 2, 3, 4, 5); 
long count = list.stream() 
    .filter(n -> n > 2) 
    .map(n -> n * 2) 
    .count(); 
System.out.println(count); </integer>
`

49. Explique o comportamento do seguinte código:
`
List<integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
numbers.stream() 
    .filter(n -> n > 2) 
    .forEach(System.out::println); </integer>
`

50. Qual será a saída do seguinte código e por quê?
`
Map<string, integer=""> map = new HashMap<>(); 
    map.put("one", 1); map.put("two", 2); 
    map.put("three", 3); 
    map.merge("two", 3, Integer::sum); 
System.out.println(map.get("two")); </string,>
`