`(String[]` no método `main`
Nada mais é que um array de Strings

Array é utilizado quando queremos utilizar um conjunto valores/informações.

---
### Declarando array em Java:
```java
double[] precos = new double[3];
```
Traduzindo, primeiramente dizemos o _tipo de dado_ que será armazenado no array, seguido de colchetes(representando um array vazio), depois o nome da variável para esse array. Como array em Java é tratado como objeto precisamos instanciá-lo através do `new`, e também precisamos dizer quantas posições irá ter esse array.
_**Obs.: Por default todas as posições desse array se inicializam em 0(zero)**_

### Acessando posições em um array
Os índices(posições) começam sempre na posição zero.
(ÚLTIMO ÍNDICE DO ARRAY = TAMANHO DELE - 1)

Acessando a primeira posição:
```java
	System.out.println(precos[0]); //   |0|
```

### Atribuindo valor em uma posição de um array
```java
precos[0] = 4999.9;     // primeira posição
```

### Acessando posições de um array
Nesse caso em específico se passa variável `i` como referência, pois inicia em 0 e vai ser incrementada até o atingir o tamanho do array
```java
for ( int i = 0; i < precos.length; i++ ){  
    System.out.println(precos[i]);
}
```

---
## ARRAYS DE REFERÊNCIA
Agora ao instanciar/criar um novo array, já não vem mais com os valores default, pois agora são uma referência de memória - ainda desconhecida -> `null`.

Ex.: Foi criado uma classe Produto, na qual tem como atributos `nome` e `preco`. Agora precisamos criar e popular um array de produtos.

```java
// |null|null|null|null|
Produto[] produtos = new Produto[4];
```

#### Acessando primeiro produto ao instanciar um array
Por default como não tem conteúdo no array, irá me retorna `null`

```java
System.out.println("primeira posição ao instanciar um array: " + produtos[0]); // null
```

#### Acessando nome do primeiro produto ao instanciar array
Como ainda não foi inicializado nenhum produto, ao tentar pegar o nome do produto, me estoura uma exception:

```java
System.out.println("primeira posição ao instanciar um array: " + produtos[0].getNome()); // NullPointerException
```

**OBS.: Note a diferença ao apenas VER o produto na primeira posição e ao acessar um ATRIBUTO do primeiro produto**

_**INSTANCIANDO UM PRODUTO**_
Colocando um produto na primeira posição
```java
produtos[0] = new Produto("IPhone 14", 4000.9)
```

ANTES: | null | null | null | null |
DEPOIS: | IPhone 14 | null | null | null |

Obs.:
Ao tentar acessar atributos de uma posição NÃO existente no array, me estoura uma exception do tipo `ArrayIndexOutOfBoundsException`
```java
System.out.println(produtos[10].getNome());
```
---

## ARRAYLIST
Classe para se trabalhar com array através de métodos e comportamentos que facilitam o dia-a-dia, sendo dinâmico.
Criando um `ArrayList` através do método `main`:

```java
import java.util.ArrayList;

ArrayList lista = new ArrayList();
```
Obs.: Por ser uma Classe de pacote pertencente ao Java(java.util), precisa-se importá-la

#### ACESSANDO REFERÊNCIAS
```java
// lista.add(int index)

System.out.println( lista.get(0) ); // me retorna apenas a refeência em memória da 1° posição
```

Obs.: Para acessar os métodos de Produto, como `getNome()` e `getPreco()` precisamos fazer um casting("descer" hierarquia para ter acesso aos métodos de Produto)
_**.get(); nos retorna um Object(super Classe) por isso é necessário fazer o casting**_

```java
Produto celular = (Produto) lista.get(0);

// COM ISSO CONSIGO ACESSAR NOME E PRECO

System.out.println(celular.getNome());
System.out.println(celular.getPreco());
```

#### ARRAYLIST COM GENERICS
Para trabalhar com Generics em ArrayList, basta colocar `<>`
Ao criar o `ArrayList<>` eu posso especificar qualquer tipo que eu quiser dentro de `<>`

```Java
ArrayList<Produto> lista = new ArrayList<>();
```

Agora todos os métodos que precisarei acessar ou recuperar, já irá retornar um `Produto` e não mais um `Object`. 
Também, agora não precisaremos mais utilizar o `casting` para acesso aos métodos de `Produto`, pois já está retornando um `Produto`.

#### MÉTODOS ARRAYLIST
- verificando tamanho do array
```java
System.out.println( "Tamanho do Array: " + lista.size() );
```

- removendo um elemento do array e remover tudo
```java
// lista.remove(int index);
lista.remove(3); // passando indice

lista.clear(); // removendo todos os elementos
```

- verificar se array está vazio
```java
lista.isEmpty()
```

Ao pedir para exibir, se estiver vazio tem que retornar `true`, caso contrário `false` (BOOLEAN)

- verificando referências em memória
```java
 System.out.println(lista);
```