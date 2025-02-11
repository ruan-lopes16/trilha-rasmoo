## Records
Um `Record` é um tipo de classe especial cujo principal objetivo é simplificar a criação de classes que são essencialmente representação de dados, elimitando a necessidade de escrever código _boilerplate_ como construtores, métodos `equals`, `hashCode`e `toString`.

```java
public record Product(String name, double price){
    
}
```

```java
public static void main(String[] args) {
    var p1 = new Product("Iphone 15", 4699.9);
    var p2 = new Product("Iphone 15", 4699.9);

    System.out.println(p1.name());  // Iphone 15
    System.out.println(p1.price());  // 4699.9

    System.out.println(p1); // Product[name=Iphone 15, price=4699.9]

    System.out.println(p1.equals(p2));  // true
}
```

## Principais características
- Imutáveis, não permitem a alteração dos valores dos campos após a instânciação
- Permitem definir um construtor "compacto" para validações ou inicializações personalizadas
- Permitem a criação de métodos customizados como em qualquer outra classe regular
- Não permitem estender outras classes