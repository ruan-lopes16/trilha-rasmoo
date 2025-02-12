# Classes seladas
As classes seladas fornecem mais controle sobre a hierarquia de classes, garantindo que somente determinadas classes possam estender uma classe selada,
aumentando a segurança e a clareza da arquitetura.

```java
public sealed class Animal permits Cachorro, Gato {
    // somente a Classe Cachorro e Gato, podem herdar de Animal
}
```

```java
public sealed class Gato extends Animal permits GatoDomestico {
    // somente a Classe GatoDomestico, pode herdar de Gato.
    // Gato é filha de Animal
}
```

```java
public final class Cachorro extends Animal {
}
```

```java
public final class GatoDomestico extends Gato {
}
```

As classes listadas após `permits` devem ser classes que diretamente estendem a classe selada. Elas devem ser `final`, `sealed` ou `non-sealed`

## Principais vantagens
- Controlar a hierarquia de classes
  - Permite determinar que pode estender uma classe, fornecendo uma segurança extra contra heranças indesejadas

- Tornar a arquitetura mais clara
  - Facilita compreensão das relações entre as classes, deixando claro quais são as subclasses permitidas