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
