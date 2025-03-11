# MySQL

## Significado e Vantagens
Banco de dados é uma coleção de informações da nossa realidade que são armazenadas em meios virtuais.
Sua estrutura é baseada, normalmente, em _linha e colunas_  para que todos os dados possam ser interpretados, gerenciados, modificados, organizados e atualizados.
Dessa forma, podem ser recuperados de maneira rápida. Contudo, um banco de dados é o agrupamento de informações que tratam do mesmo assunto, e que precisam ser armazenados para segurança ou conferência futura.

Com todas essas informações armazenadas, houve a necessidade de um meio capaz de manipular todos esses dados de forma simples e intuitivo.
Com isso, surgiu o **_SGBD_** também conhecido como _Sistema Gerenciador de Banco de Dados_. 

**Vantagens de utilizar um DB**
Adotar o uso de um banco de dados permite trazer diversos benefícios para a qualquer empresa, sendo assim, podemos citar:
- Dados armazenados de forma organizada
- Informações protegidas e acesso restrito
- Melhor comunicação entre os setores
- Aumento da produtividade na empresa

---
## Tipos de Banco de Dados
**Banco de Dados Relacional**
Os bancos de dados relacionais, também chamados de _bancos SQL_ possuem uma estrutura hierárquica que permite a organização das suas informações em tabelas, contendo linhas e colunas.

-------------------------------------------------------------
| ID |    CPF    |      NOME      |  TELEFONE  | NASCIMENTO |
-------------------------------------------------------------
| 1  | 111111111 |   RUAN SANTOS  | 3499999991 | 2003-03-16 |
-------------------------------------------------------------
| 2  | 222222222 | PATRICK MACIEL | 3499999992 | 1986-10-14 |
-------------------------------------------------------------
| 3  | 333333333 | HYAN RODRIGUES | 3499999993 | 2001-05-15 |
-------------------------------------------------------------
| 4  | 444444444 |  JOHNNY SILVA  | 3499999994 | 2003-08-10 |
-------------------------------------------------------------

**Banco de Dados NÂO Relacional**
É muito utilizado pela alta performance e por manter todos os registros em uma única estrutura de dados.
Portanto, não é necessário criar um sistema de relacionamento como é feito nos bancos de dos relacionais.
Como as informações não estão associadas entre si, é mais fácil fazer alterações e exclusões no conteúdo.

Existem diversos tipos de banco de dados não relacional, ele são categorizados pela sua maneira de armazenamento de dados. Os tipos mais utilizados de _bancos NoSQL_ são:
- Chave-Valor
- Baseado em documento

### NoSQL: Baseado em documentos
Os bancos não relacionais baseados em documentos armazenam seus dados de forma semelhante aos objetos `JSON`(JavaScript Object Notation).
Eles guardam todas as informações para um determinado objeto em uma única instância no banco de dados e cada objeto armazenado pode se diferente de todos os outros

Normalmente, possuem poderosas linguagens para consultas e podem ser facilmente escalados de forma horizontal, acomodando uma grande quantidade de informações.
Ex.:
```
[ // lista, coleção, array de informações
    { // objeto 1
        "id": "eadsfiaj-f103-247h-es43-21dsfdsaqi",
        "cpf": 111111111,
        "nome": "RUAN SANTOS",
        "telefone": "3499999991",
        "cadastro": "2003-03-16",
        "endereco": {
            "bairro": "Canaã",
            "cidade": "Terra prometida",
            "uf": "JV"
        }
    },
    { // objeto 2
        "id": "ead345fj-3rt6-14rf-gfhj9-21ds34yaqi",
        "cpf": 111111111,
        "nome": "PATRICK MACIEL",
        "telefone": "3499999992",
        "cadastro": "1986-10-14"
    }
]
```

_Obs.: Posso colocar qualquer tipo de informação que o banco irá aceitar_

### NoSQL: Chave-Valor
O banco de dados do tipo chave-valor é formado por pares de chaves com seus respectivos valores. 
_Esses valores podem ser qualquer tipo de dado e eles podem ser recuperados quando uma consulta é realizada a sua chave, fazendo com que sua consulta seja muito simples._

Esses tipo de banco é ótimo para quando você precisa armazenar grandes quatidade de dados, porém não há necessidade de realizar consultas complexas nele.

Uma de suas principais aplicações são os dados em _cache_.

Ex.: Recuperando/Buscando valor da chave K1 e K2

---------------------------- ---------------------------------------------
| CHAVE |                             VALOR                              |
--------------------------------------------------------------------------
|   K1  | ert67uio-123c-sad1-klo0-ertgv344g                              |
--------------------------------------------------------------------------
|   K2  | { "nome": "Rasmoo", "idade": 21, "dataCadastro": "2017-12-13"} |
--------------------------------------------------------------------------
_Obs.: Posso colocar qualquer tipo de informação que o banco irá aceitar_

## SQL x NoSQL

--------------------------------------------------------------------------------------------------------------------
|               |                  SQL                |                           NoSQL                            |
--------------------------------------------------------------------------------------------------------------------
|   Histórico   | Foco na redução de dados duplicados | Foco em escalabilidade e mudança rápida de desenvolvimento |
--------------------------------------------------------------------------------------------------------------------
| Armazenamento |     Tabelas com linhas e colunas    |                Documento JSON, Chave-Valor                 |
--------------------------------------------------------------------------------------------------------------------
|   Esquemas    |                Rígido               |                          Flexível                          |
--------------------------------------------------------------------------------------------------------------------
| Escalonamento |              Vertical               |                         Horizontal                         |
--------------------------------------------------------------------------------------------------------------------
|    Exemplos   |      Oracle, MySQL, PostgreeSQL     |                 MongoDB, DynamoDB, Redis                   |
--------------------------------------------------------------------------------------------------------------------