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

#### EQUALS (critério de igualdade)
Um método da super classe Object (precisa sobreescrever @Override)
Utilizado para ver se um objeto é igual ao outro (ref. de memória)
```java
@Override
public boolean equals(Object ref) { // recebe um objeto como parâmetro, com a intenção de comparar se o objeto atual é igual ao que foi passado.

        Produto produto = (Produto) ref; // cast

        if (this.nome != produto.getNome()) {
        // se o nome for diferente do nome q estamos passamos como parametro...
            return false;
        } else {
            return true;
        }
```

- verificando se o que passamos como parâmetro, existe no ArrayList
```java
lista.contains(parametro);
```

- verificando qual o índice do objeto que passaremos como parâmetro
```java
lista.indexOf(parametro)
```
Obs.: caso não exista, irá retornar -1

`indexOf()` e `contains()`
Utilizam o mesmo critério de igualdade `equals`

```java
package arrays.test;

import arrays.model.Produto;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        // inicializando um ArrayList de Produto(generics)
        ArrayList<Produto> lista = new ArrayList();

        // criando produtos
        Produto p1 = new Produto( "Celular", 1999.9 );
        Produto p2 = new Produto( "Geladeira", 2499 );
        Produto p3 = new Produto( "Notebook", 3000);
        Produto p4 = new Produto( "Notebook", 3000);

        // adicionando valores a um ArrayList - lista
        lista.add(p1); // 0
        lista.add(p2); // 1
        lista.add(p3); // 2
        // p4 não foi adicionado

        System.out.println(lista.contains(p4)); // true (equals por tras dos panos)
        // método booleano q verifica se o que passamos como parametro, existe no ArrayList

        System.out.println(lista.indexOf(p4)); // 2 (equals por tras dos panos)
        // me retorna a posição do objeto passado -> caso não exista retorna -1

        System.out.println("Ref p3: " + p3);
        System.out.println("Ref p4: " + p4);
        // mesmos atributos, porém alocações em memória são diferentes, pois cada um é um objeto

        if (p3 == p4) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes"); //
        }

        // equals
        if (p3.equals(p4) ) {
            System.out.println("São iguais"); //
        } else {
            System.out.println("São diferentes");
        }

    }
}
```
---
#### Ordenando com foreach
Para apenas exibir os nomes que estão no ArrayList com foreach
primeiro se passa o tipo, uma variável e o array, e dentro do escopo coloco os comandos
```java
for (String nome:nomes) { // para cada nome do array, faça -> tipo variavel: array  
    System.out.println(nome);  
}
```

deixando em ordem alfabética
```java
Collections.sort(nomes);  
for (String nome:nomes) { // para cada nome do array, faça -> tipo variavel: array  
    System.out.println(nome);  
}
```

`Collections` -> classe que contém métodos estáticos(static), muito utilizado com ArrayList, por conter funcionalidades que ajudam em algumas coisas quando querendo trabalhar com coleções de dados