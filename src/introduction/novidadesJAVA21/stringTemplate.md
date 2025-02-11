## String Template
O *String Template* é uma forma de criar *Strings* dinâmicas, mais legíveis e mais seguras, permitindo incorporar valores e expressões dentro da própria `String`.

Existem formas mais antigas de criar essas *Strings*, como concatenações ou método `String.format`, por exemplo.
Ambas as formas funcionam, mas são propensoso a erros e dificultam a leitura e manuntenção do código.

```java
var product = "Iphone 14";
var price 4000.9;
var discountPercent = 10;

System.out.println("O preço final do " + product + " com desconto, ficou R$ " + (price - price * discountPercent/100));
System.out.println(String.format("O preço final do %s com desconto, ficou R$ %.2f", product, price - price * discountPercent/100));

// O preço final do Iphone 14 com desconto, ficou R$ 4000.90
```

**_String Template_**
```java
System.out.println(STR."O preço final do \{product} com desconto, ficou R$ \{price * discountPercent/100}");
// O preço final do Iphone 14 com desconto, ficou R$ 4000.90
```

### VANTAGEM
Dessa forma, o _String Template_ veio para resolver essas questões oferecendo uma sintaxe mais limpa e segura. Alguns benefícios são:
- Legibilidade: Facilita a leitura e entendimento do código;
- Segurança: Reduz a possibilidade de erros e vulnerabilidades;
- Flexibilidade: Facilita a criação de _Strings_ complexas sem a necessidade de métodos auxiliares