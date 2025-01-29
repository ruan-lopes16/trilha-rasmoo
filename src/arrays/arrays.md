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
