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

# TABELAS E TIPOS DE DADOS
As tabelas são objetos que possuem todas as informações em um banco de dados. Nelas, os dados são organizados de forma lógica em um conjunto de linhas e colunas. 
Cada linha representa um registro e cada coluna representa um campo desse registro.

Cada coluna é representada por um tipo de dado que deverá constar na tabela. Dentre os tipos de dados, existem os numéricos, textos, datas, entre outros. 

Contudo, a tabela é como se fosse uma planilha e o conjunto de várias delas, formam a base de dados.

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

------------------------------------------
| ID |    NOME    |  PRECO  |  CADASTRO  |
------------------------------------------
| 1  |  TV SMART  | 1999.90 | 2024-03-16 |
------------------------------------------
| 2  | SMARTPHONE | 4999.90 | 2024-10-14 |
------------------------------------------

## TIPOS DE DADOS
Existem diversos tipos de dados que podem ser úteis para atender determinadas situações. Porém, os tipos mais utilizados são:
Numéricos:
- INT
- BIGINT
- BOOL
- FLOAT
- DOUBLE
- DECIMAL

Textos:
- CHAR      // um caracter
- VARCHAR   // conjunto de caracteres
- TEXT
- ENUM     // define o valor que a coluna pode ter

Datas:
- DATE
- DATETIME
- TIMESTAMP
- TIME
- YEAR

# MER
## Modelo Entidade e Relacionamento

O Modelo Entidade e Relacionamento, também chamado de MER, são diagramas utilizados para representar, de forma abstrata, a estrutura de um banco de dados. 
Normalmente descrevem os objetos da nossa realidade através de entidades, contendo propriedades que são os atributos e os seus devidos relacionamentos.

- Entidades
Representam objetos da nossa realidade, possuem uma existência independente e normalmente são representadas nominalmente por substantivos. 
- Contudo, é possível dizer que Pessoas, Produtos, Departamentos, Empresas e Escolas, são exemplos de entidades.

- Atributos
Descrevem as propriedades das entidades, são as características que cada entidade possui dentro de um determinado domínio. 
- A entidade pessoa por exemplo, possui um nome, e-mail, data de nascimento, estado civil, endereço, entre outros.

- Relacionamentos
Descreve o relacionamento entre as entidades e normalmente são representados por verbos. Por exemplo, entre as entidades escola e aluno, é possível dizer que “uma escola possui vários alunos”. 
Dessa forma, de acordo com cada tipo de relacionamento, podemos classifica-los em três tipos:

  - Um para Um (1..1) 
    Uma entidade X se associa unicamente a uma outra entidade Y.

  - Um para Muitos (1..N)
    Uma entidade X pode referenciar a várias ocorrências de uma entidade Y. Porém, essa entidade Y pode apenas referenciar uma única ocorrência da entidade X.

  - Muitos para Muitos (N..N)
    A entidade X pode referenciar diversas ocorrências da entidade Y e a entidade Y pode também se referenciar a várias ocorrências da entidade X.

_Obs.: Exemplo de **MER** feito em **MySQL Workbench 8.0 CE**_

# CRIANDO O BANCO DE DADOS
A sintaxe de criação de um banco de dados é bem simples e intuitiva e se você tiver um pouco de conhecimento da língua inglesa fica mais fácil ainda de entender.
`CREATE DATABASE rasmoo_plus;`

Depois de criado, é necessário informar ao MySQL que ele será utilizado.
`USE rasmoo_plus;`

Feito isso, o banco de dados está criado e pronto para uso. Agora está faltando somente criar as tabelas.

# CRIANDO AS TABELAS
Para criar uma tabela basta utilizar o comando CREATE TABLE e colocar em prática tudo aquilo que foi aprendido sobre tipos de dados.
`
CREATE DATABASE rasmoo_plus;

USE rasmoo_plus;

CREATE TABLE user_type(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL UNIQUE,
  description TEXT
);

CREATE TABLE users(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(150) NOT NULL UNIQUE,
  phone VARCHAR(13) NOT NULL,
  cpf VARCHAR(11) NOT NULL UNIQUE,
  user_type_id INT NOT NULL,
  FOREIGN KEY(user_type_id) REFERENCES user_type(id)
);

CREATE TABLE subscription_type(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL UNIQUE,
  access_days INT NOT NULL,
  description TEXT
);

CREATE TABLE subscriptions(
  id INT PRIMARY KEY AUTO_INCREMENT,
  dt_subscription DATE NOT NULL,
  user_id INT NOT NULL UNIQUE,
  subscription_type_id INT NOT NULL,
  FOREIGN KEY(user_id) REFERENCES users(id),
  FOREIGN KEY(subscription_type_id) REFERENCES subscription_type(id)
);

CREATE TABLE courses(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(120) NOT NULL,
  description TEXT,
  certificate_hours DOUBLE NOT NULL,
  dt_creation DATE NOT NULL
);

CREATE TABLE subscription_course(
  id INT PRIMARY KEY AUTO_INCREMENT,
  subscription_id INT NOT NULL,
  course_id INT NOT NULL,
  FOREIGN KEY(subscription_id) REFERENCES subscriptions(id),
  FOREIGN KEY(course_id) REFERENCES courses(id)
);

SHOW TABLES;
`

# MANIPULANDO DADOS
## INSERINDO REGISTROS
A sintaxe de inserção de novos registros em uma tabela é bem simples, basta seguir o modelo abaixo:
`INSERT INTO nome_da_tabela VALUES(valor1, valor2, ..., valorN);`
`INSERT INTO nome_da_tabela(campo1, ..., campoN) VALUES(valor1, ..., valorN);`

Agora que você já aprendeu a sintaxe básica de como inserir novos registros no banco de dados, está na hora de praticar um pouco.

Para esse treinamento, crie diversas querys para popular as tabelas do nosso banco de dados.
1° método de inserção de valores
// como não usei a 'referencia', preciso escrever o que cada coluna tem
`INSERT INTO user_type VALUES(null, 'ALUNO', null);`
`INSERT INTO user_type VALUES(null, 'PROFESSOR', null);`
`INSERT INTO user_type VALUES(null, 'ADMINISTRADOR', null);`

2° método de inserção de valores
// passando apenas para as colunas name e access_day o resto pertence como está
`INSERT INTO subscription_type(name, access_days) VALUES ('Java Path', 120);`
`INSERT INTO subscription_type (name, access_days) VALUES('Javascript Path', 60);`
`INSERT INTO subscription_type (name, access_days) VALUES('Full Stack Path', 90);`

// inserir várias linhas em uma tabela em um único comando
// posso declarar ou não as colunas que quero inserir as novas informações
```
INSERT INTO users (name, email, phone, cpf, user_type_id) VALUES`
  ('Ana Luisa', 'analuisa@gmail.com', '5521999999901', '11122233301', 1),
  ('Vanessa', 'vanessa@gmail.com', '5521999999902', '11122233302', 1),
  ('Marcos', 'marcos@gmail.com', '5521999999903', '11122233303', 1), 
  ('Yuri', 'yuri@gmail.com', '5521999999906', '11122233306', 1), 
  ('Matheus', 'matheus@gmail.com', '5521999999907', '11122233307', I), 
  ('Mario', 'mario@gmail.com', '5521999999908', '11122233308', 1), 
  ('Larissa', 'larissa@gmail.com', '5521999999909', '11122233309', 1), 
  ('Vinicios', 'vinicios@gmail.com', '5521999999910' '11122233310', 1)
  ('Patricia', 'patricia@gmail.com' , '5521999999911', '11122233311', 1) ,
  ('Mauricio', 'mauricio@gmail.com' , '5521999999912, '11122233312', 1),
  ('Pedro Henrique', 'pedro@gmail.com', '5521999999904', '11122233304', 2), 
  ('Felipe', 'felipe@gmail.com', '5521999999905', '11122233305', 3);
```

## ALTERANDO REGISTROS
Para alterar algum registro, basta utilizar o comando `UPDATE` seguido do nome da tabela, apontar os campos que serão atualizados e informar para qual registro que será alterado.
```
UPDATE nome_da_tabela
  SET campo1 = valor1,
      campo2 = valor2,
      ...,
      campoN = valorN
WHERE campoX = ?;
```
Agora que você já aprendeu a sintaxe básica de como alterar os registros no banco de dados, está na fora de praticar um pouco.
Para esse treinamento, crie algumas querys com o objetivo de atualizar os seguintes registros que foram inseridos de forma errada.

```
INSERT INTO courses (name, certificate_hours, dt_creation) VALUES
('HTTP Protocol', 10, CURDATE()), 
('MyySQqL', 18, CURDATE()),
('Java Bsic', 20, CURDATE()),
('Java Advanced', 40, CURDATE()), 
('Sping B0ot', 100, CURDATE()), 
('Spring Data JPA', 25, CURDATE()) , 
('Spring Security', 30, CURDATE()), 
('Angular Advanced', 50, CURDATE()) ,
('Build your backend with NodeJS', 30, CURDATE()), 
('Applications with NextJS', 40, CURDATE());

UPDATE courses SET name = 'MySQL' WHERE id = 2;
UPDATE courses SET name = 'Java Basic' WHERE name = 'Java Bsic';
UPDATE courses SET name = 'Spring Boot' WHERE name="Sping B0ot';
```

## EXCLUINDO REGISTROS
Agora que você já aprendeu a inserir e alterar registros em uma tabela, está na hora de saber deletar um registro também. A sintaxe de deleção é bem simples.
```
DELETE FROM nome_da_tabela;
DELETE FROM nome_da_tabela WHERE condição;
```

Agora que você já aprendeu a sintaxe básica de como deletar os registros no banco de dados, está na hora de praticar um pouco.
Para esse treinamento, faça uma instrução SQL que:
  a) Delete o usuário que possui o id de número 7.
      `DELETE FROM users WHERE id = 7;`
  b) Delete todos os usuários que comecem com as letras "Ma".
      `DELETE FROM users WHERE name LIKE 'Ma%';`

# ESTRUTURA BÁSICA DE UMA CONSULTA
Vamos começar aprendendo a estrutura básica de uma consulta
`SELECT * FROM nome_da_tabela;`
`SELECT * FROM nome_da_tabela WHERE condicao;`
`SELECT coluna1, coluna2, ..., colunaN FROM nome_da_tabela;`
`SELECT coluna1, coluna2, ..., colunaN FROM nome_da_tabela;`
Agora que você já aprendeu a estrutura básica de uma consulta, está na hora de praticar um pouco.
Para esse treinamento, faça uma instrução SQL que:
  a) Retorne todos os dados do usuário que se chama Pedro Henrique.
  --------------------------------------------------------------------------------------
  | id |      name      |      email      |     phone     |     cpf     | user_type_id |
  --------------------------------------------------------------------------------------
  | 11 | Pedro Henrique | pedro@gmail.com | 5521999999904 | 11122233304 |      2       |
  --------------------------------------------------------------------------------------

  b) Retorne os nomes de todos os usuários que possuam a coluna “user_type_id” igual a 1.
  `SELECT name FROM users WHERE user_type_id = 1;`
  -------------
  | name      |
  | Ana Luisa |
  | Vanessa   |
  | Yuri      |
  | Vinicios  |
  | Patricia  |
  -------------

# SUBCONSULTA OU SUBQUERY
Uma subquery ou subconsulta, é instrução SQL dentro de outra instrução SQL, ou seja, é basicamente uma consulta embutida dentro de outra consulta.
Dessa forma, ela funciona passando os resultados da consulta mais interna para a consulta mais externa através de uma condição.
Além disso, também é possível utilizar subconsulta em operações como INSERT, UPDATE e DELETE.

```
SELECT 
  coluna1,
  ...,
  colunaN
FROM nome_da_tabela WHERE condicao (
  SELECT coluna FROM nome_da_tabela [WHERE condicao]
);
```

```
INSERT INTO nome_da_tabela(coluna1, ... colunaN) (
  SELECT coluna1, ..., colunaN FROM nome_da_tabela [WHERE condicao]
);

UPDATE nome_da_tabela
  SET coluna1 = valor1,
      coluna2 = valor3,
      ...,
      colunaN = valorN
WHERE condicao (
  SELECT coluna FROM nome_da_tabela [WHERE condicao]
);

DELETE FROM nome_da_tabela WHERE condicao (
  SELECT coluna FROM nome_da_tabela [WHERE condicao]
);
```

Agora que você já aprendeu a estrutura básica de uma subconsulta, está na hora de praticar um pouco.​
Para esse treinamento, faça uma instrução SQL que:

a) Retorne todos os usuários que possuam uma assinatura
  `SELECT * FROM users WHERE id IN (SELECT user_id FROM subscriptions);`

-------------------------------------------------------------------------------------
| id | name      | email               | phone         | cpf         | user_type_id |
-------------------------------------------------------------------------------------
| 1  | Ana Luisa | analuisa@gmail.com  | 5521999999901 | 11122233301 | 1            |
-------------------------------------------------------------------------------------
| 2  | Vanessa   | vanessagmail.com    | 5521999999902 | 11122233302 | 1            |
-------------------------------------------------------------------------------------
| 4  | Yuri      | yuri@gmail.com      | 5521999999906 | 11122233306 | 1            |
-------------------------------------------------------------------------------------
| 8  | Vinicios  | vinicios@gmail.com  | 5521999999910 | 11122233310 | 1            |
-------------------------------------------------------------------------------------
| 9  | Patricia  | patricia@gmail.com  | 5521999999911 | 11122233311 | 1            |
--------------------------------------------------------------------------------------

b) Retorne todos os usuários que sejam do tipo ”ADMINISTRADOR”.
 `SELECT * FROM users WHERE user_type_id = (
    SELECT id FROM user_type WHERE name = 'ADMINISTRADOR'
 );`

-----------------------------------------------------------------------------------
| id | name      | email             | phone         | cpf         | user_type_id |
-----------------------------------------------------------------------------------
| 12 | Felipe    | felipe@gmail.com  | 5521999999905 | 11122233305 | 3            |
-----------------------------------------------------------------------------------

c) Delete todos os usuários que sejam do tipo ”PROFESSOR”.
 `DELECT FROM users WHERE user_type_id = (
    SELECT id FROM user_type WHERE name = 'PROFESSOR'
 );`

-------------------------------------------------------------------------------------
| id | name      | email               | phone         | cpf         | user_type_id |
-------------------------------------------------------------------------------------
| 1  | Ana Luisa | analuisa@gmail.com  | 5521999999901 | 11122233301 | 1            |
-------------------------------------------------------------------------------------

d) Salve em uma outra tabela as informações “name”, “email”, “phone”, “cpf” e “user_type_id” de todos os usuários cadastrados na tabela “users”.
 `INSERT INTO users_bkp(name, email, phone, cpf, user_type_id) (
    SELECT name, email, phone, cpf, user_type_id FROM users
 );
 SELECT * FROM users_bkp;`

# COMBINANDO TABELAS
A cláusula JOIN é usada para combinar dados provenientes de duas ou mais tabelas do banco de dados, baseado em um relacionamento entre colunas destas tabelas.

INNER JOIN: Retorna registros que possuem valores relacionados nas duas tabelas.
LEFT JOIN: Retorna todos os registros da tabela da esquerda e os registros relacionados da tabela da direita.
RIGHT JOIN: Retorna todos os registros da tabela da direita e os registros relacionados da tabela da esquerda.

`SELECT coluna1, ..., colunaN
  FROM nome_da_tabela alias1
  (INNER, LEFT, RIGHT) JOIN nome_da_tabela alias2
 ON alias1.colunaX = alias2.colunaX;`

Agora que você já aprendeu a estrutura básica da cláusula JOIN, está na hora de praticar um pouco.
Para esse treinamento, faça uma instrução SQL que:
  a) Retorne o nome e o tipo de todos os usuários
  `SELECT u.name, ut.name AS type FROM users u
      INNER JOIN user_type ut ON ut.id = u.user_type_id;`

  -----------------------------
  | name      | type          |
  -----------------------------
  | Ana Luisa | ALUNO         |
  -----------------------------
  | Vanessa   |  ALUNO        |
  -----------------------------
  | Yuri      | ALUNO         |
  -----------------------------
  | Vinicios  | ALUNO         |
  -----------------------------
  | Patricia  | ALUNO         |
  -----------------------------
  | Felipe    | ADMINISTRADOR |
  -----------------------------

 b) Retorne todos os usuários que possuam uma assinatura
 `SELECT u.* FROM users u
      INNER JOIN subscriptions s ON u.id = s.user_id;`
 
-------------------------------------------------------------------------------------
| id | name      | email               | phone         | cpf         | user_type_id |
-------------------------------------------------------------------------------------
| 1  | Ana Luisa | analuisa@gmail.com  | 5521999999901 | 11122233301 | 1            |
-------------------------------------------------------------------------------------
| 2  | Vanessa   | vanessagmail.com    | 5521999999902 | 11122233302 | 1            |
-------------------------------------------------------------------------------------
| 4  | Yuri      | yuri@gmail.com      | 5521999999906 | 11122233306 | 1            |
-------------------------------------------------------------------------------------
| 8  | Vinicios  | vinicios@gmail.com  | 5521999999910 | 11122233310 | 1            |
-------------------------------------------------------------------------------------
| 9  | Patricia  | patricia@gmail.com  | 5521999999911 | 11122233311 | 1            |
-------------------------------------------------------------------------------------

 c) Retorne o nome, cpf, o tipo e a data de assinatura de todos os usuários que possuam uma assinatura.
 `SELECT u.name, u.cpf, st.name AS type, s.dt_subcription FROM users u
      INNER JOIN subscriptions s ON u.id = s.user_id
      INNER JOIN subscription_type st ON s.subscription_type_id = st.id;`
 
---------------------------------------------------------------
| name      | cpf         | type            | dt_subscription |
---------------------------------------------------------------
| Ana Luisa | 11122233301 | Full Stack Path | 2022-02-05      |
---------------------------------------------------------------
| Vanessa   | 11122233302 | Full Stack Path | 2022-02-05      |
---------------------------------------------------------------
| Yuri      | 11122233306 | Java Path       | 2022-02-05      |
---------------------------------------------------------------
| Vinicios  | 11122233310 | Java Path       | 2022-02-05      |
---------------------------------------------------------------
| Patricia  | 11122233311 | Javascript Path | 2022-02-05      |
---------------------------------------------------------------

 d) Retorne todos os dados dos usuários e sua respectiva data de assinatura. Caso o usuário não possua uma assinaturam a query deverá retorna _NULL_ na coluna "dt_subscription"
 `SELECT u.*, s.dt_subscription FROM users u
      LEFT JOIN subscriptions s ON u.id = s.user_id;`
 
-------------------------------------------------------------------------------------------------------
| id | name      | email               | phone         | cpf         | user_type_id | dt_subscription |
-------------------------------------------------------------------------------------------------------
| 1  | Ana Luisa | analuisa@gmail.com  | 5521999999901 | 11122233301 | 1            | 2022-02-05      |
-------------------------------------------------------------------------------------------------------
| 2  | Vanessa   | vanessagmail.com    | 5521999999902 | 11122233302 | 1            | 2022-02-05      |
-------------------------------------------------------------------------------------------------------
| 4  | Yuri      | yuri@gmail.com      | 5521999999906 | 11122233306 | 1            | 2022-02-05      |
-------------------------------------------------------------------------------------------------------
| 8  | Vinicios  | vinicios@gmail.com  | 5521999999910 | 11122233310 | 1            | 2022-02-05      |
-------------------------------------------------------------------------------------------------------
| 9  | Patricia  | patricia@gmail.com  | 5521999999911 | 11122233311 | 1            | (NULL)          |
-------------------------------------------------------------------------------------------------------