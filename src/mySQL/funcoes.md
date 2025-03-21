# FUNÇÔES

Existem diversas funções nativas que possibilitam realizar várias operações, dentre elas: realizar cálculos, manipular strings, datas, operações lógicas, extrair informações dos registros, entre outras. ​

As funções estão divididas em diferentes categorias: 

- Funções de agregação
- Funções de string
- Funções numéricas
- Funções de data

## FUNÇÔES DE AGREGAÇÃO
Esses tipos de funções são responsáveis por agrupar diversos valores e retornar somente um único valor para determinado grupo. Em resumo, ela processa um conjunto de valores de uma única coluna de uma tabela e retorna um único valor como resultado.​

- MAX – Retorna o maior valor de um determinado conjunto.
- MIN – Retorna o menor valor de um determinado conjunto.
- SUM – Retorna a soma dos valores de um determinado conjunto.
- AVG – Retorna a média dos valores de um determinado conjunto.
- COUNT – Retorna o total de linhas selecionadas.
- GROUP BY – Agrupa os valores de uma coluna baseado nas semelhanças entre elas.
- HAVING – Utilizada para filtrar grupos de registros. Normalmente utilizada junto com a cláusula GROUP BY.

Agora que você já aprendeu sobre funções de agregação, está na hora de praticar um pouco.
Para esse treinamento, faça uma instrução SQL que:
a) Retorne o total de cursos que possuam um certificado com mais de 30 horas.
`SELECT COUNT(*) FROM courses WHERE certificate_hours > 30;`

b) Retorne a hora média dos certificados da tabela cursos.
`SELECT AVG(certificate_hours) FROM courses;`

c) Retorne o total de aluno por tipo de assinatura.
`SELECT st.name AS type, COUNT(s.user_id) AS users
FROM
    subscriptions s 
        INNER JOIN
    subscriptions_type st ON st.id = s.subscription_type_id
GROUP BY st.name;
`

d) Retorne os tipos de assinatura que possuem no mínimo 2 alunos associados
`
SELECT st.name AS type
FROM subscription s
    INNER JOIN subscription_type st ON st.id = s.subscription_type_id
GROUP BY st.name HAVING COUNT(s.user_id) >= 2;
`

## FUNÇÕES DE STRING
As funções de string são utilizadas para modificar os dados como também a forma como são apresentados.

- SUBSTRING – Seleciona parte de uma string a partir de uma posição inicial e final.
- LENGTH – Retorna a quantidade de caracteres de uma determinada string.
- CONCAT – Concatena um ou diversos caracteres.
- LOWER – Converte a string para minúsculo.
- UPPER – Converte a string para maiúsculo.
- REPLACE – Substitui um, ou um conjunto, de caractere por outro.
- TRIM – Remove os espaços do lado esquerdo e direito da string.
- REVERSE – Inverte a string.

Agora que você já aprendeu sobre funções de string, está na hora de praticar um pouco.
Para esse treinamento, faça uma instrução SQL que:

a) Retorne o nome de todos os usuários em caixa alta.

`
SELECT UPPER(name) FROM users;
`

b) Retorne o e-mail de cada usuário com sua respectiva quantidade de caracteres.
`
SELECT email, LENGTH(email) FROM users;
`

c) Retorne os tipos de usuário com o sufixo “_TYPE”.
`
SELECT CONCAT(name, '_TYPE') FROM user_type;
`

## FUNÇÕES NUMÉRICAS
Esses tipos de funções são responsáveis por realizar operações de cálculos. Dessa forma, não é necessário utilizar apenas operadores comuns.​

- ROUND – Arredonda um valor de acordo com o número de casas decimais informada.
- TRUNCATE – Retorna um valor truncado de acordo com o número de casas decimais informada.
- SQRT – Retorna o resultado da raiz quadrada de um determinado valor.
- FLOOR – Arredonda um valor para baixo.
- CEILING – Arredonda um valor para cima.
- POW – Retorna o resultado de x elevado a y.

Agora que você já aprendeu sobre funções numéricas, vamos ver alguns exemplos:
`
SELECT POW(10, 2) FROM DUAL;
SELECT FLOOR(92.8) FROM DUAL;
SELECT ROUND(92.8) FROM DUAl;
SELECT SQRT(100) FROM DUAL;
SELECT CEILING(95.2) FROM DUAL;
`

## FUNÇÕES DE DATA
As funções de data permitem a manipulação de informações baseado em tempo. 

- CURDATE – Retorna a data atual no formato yyyy-MM-dd.
- CURTIME – Retorna a hora atual no formato HH:mm:ss.
- NOW – Retorna a data e hora atual.
- DATEDIFF – Retorna a diferença entre duas datas.
- DATE_FORMAT – Retorna uma data de acordo com o formato informado.

Agora que você já aprendeu sobre funções de data, vamos ver alguns exemplos:
`
SELECT NOW() FROM DUAL;
SELECT CURTIME() FROM DUAL;
SELECT CURDATE() FROM DUAL;
SELECT DATEDIFF('2022-02-04', '2022-01-26') FROM DUAL;
SELECT dt_subscription, DATEDIFF(dt_subscription, '%d/%m/%Y') FROM subscriptions; // fazendo formatação da data
`

## PROCEDURE
Uma stored procedure, também conhecida por procedure, é um conjunto de instruções de forma organizada que permite a execução de uma ou diversas tarefas. 
Além disso, é possível também a passagem de parâmetros de entrada para atender cada necessidade de forma individual.

Contudo, stored procedure são rotinas definidas no banco de dados, que possuem uma identificação e podem ser invocadas.

`
DELIMITER $$ /* $$ para dar inicio ao conjunto de tarefas */
CREATE PROCEDURE nomeDaProcedure(parametro(s)) /* pode receber ou não parametros */
    BEGIN
    # Implementação da procedure /* tarefas */
    END $$ /* final da tarefa */
DELIMITER; /* voltando o delimitador padrao (;) */
CALL nomeDaProcedure(parametro(s)); /* para usar a procedure - passando ou não o parametro */
`

Agora que você já aprendeu sobre procedures, está na hora de praticar um pouco.
Para esse treinamento, crie uma procedure que:

a) Delete um usuário da base de dados.
`
DELIMITER $$
CREATE PROCEDURE deleteUser(userId INT)
    BEGIN
        DECLARE subscriptionId INT;
        SELECT id INTO subscriptionId FROM subscriptions WHERE user_id = userId;
        DELETE FROM subscription_course WHERE subscription_id = subscriptionId;
        DELETE FROM subscriptions WHERE id = subscriptionId;
        DELETE FROM users WHERE id = userId;
    END $$
DELIMITER;
`
`
CALL deleteUser(1);
`
// tentando retornar valores de id 1, mas já foram deletados, segue mensagem:
_Query Executed Successfully. No Results. 0 rows affected._
`
SELECT * FROM subscriptions WHERE user_id = 1;
SELECT * FROM subscriptions WHERE id = 1;
`

## FUNCTIONS
Aprendemos que com as procedures, é possível realizar processamentos e, caso necessário, obter algum retorno. 
As funções, normalmente, são utilizadas para retornar algum valor. Além disso, também é possível passarmos parâmetros para uma função.
Outro ponto interessante, é que diferentemente das procedures, as funções podem ser utilizadas no meio de uma consulta.

`
DELIMITER $$
CREATE FUNCTION nomeDaFuncao(parametro(s)) RETURNS tipoDeDado
    BEGIN
    # Implementação da função
    END $$
DELIMITER;
SELECT nomeDaFuncao(parametro(s));
`
Agora que você já aprendeu sobre functions, está na hora de praticar um pouco.
Para esse treinamento, crie uma function que:

a) Informe se o usuário possui uma assinatura ativa
`
DELIMITER $$
RETURNS BOOL
CREATE FUNCTION isActiveSubscription (userId INT) RETURNS BOOL
    BEGIN
        DECLARE dateSubscription DATE;
        DECLARE accessDays INT DEFAULT 0;
        DECLARE isActiveSubscription BOOL DEFAULT FALSE;
        SELECT st.access_days, s.dt_subscription INTO accessDays, dateSubscription
        FROM subscriptions s INNER JOIN subscription_type st ON st.id = s. subscription_type_id
        WHERE user_id = userId;
        IF DATEDIFF (NOW(), dateSubscription) <= accessDays THEN
            SET isActiveSubscription = TRUE;
        END IF;
        RETURN isActiveSubscription;
    END $$
DELIMITER;
`

`SELECT isActiveSubscription(2);`
`SELECT isActiveSubscription(8);`

## GATILHOS/TRIGGERS
Os triggers são eventos programáveis que são executados antes ou depois de uma determinada ação. 
Normalmente essas ações são alterações nas tabelas através de operações como INSERT, UPDATE e DELETE.

`
DELIMITER $$
CREATE TRIGGER nome_de_trigger AFTER/BEFORE: *INSERT/UPDATE/DELETE ON nome_da_tabela
FOR EACH ROM
    BEGIN
    # Implementação de trigger
    END $$
DELIMITER;
SHOM TRIGGERS;
DROP TRIGGER nome_do_trigger;
`

Agora que você já aprendeu sobre triggers, está na hora de praticar um pouco.
Para esse treinamento, faça um trigger que:

a) Transforme o nome do usuário em letra maiúscula e o e-mail em letra minúscula sempre antes que um novo usuário seja inserido.
`
DELINITER $$
CREATE TRIGGER toUpperCase BEFORE INSERT ON users
FOR EACH ROW
BEGIN
    SET NEW.name = UPPER(NEW.name);
    SET NEW-.mail = LOWER(NEW.email);
END $$
DELIMITER;
`

b) Salve na tabela de “users_bkp” o mesmo usuário que acabou de ser inserido na tabela “users”.
`
DELIMITER $$
CREATE TRIGGER savelserkp AFTER INSERT ON users
FOR EACH ROM
    BEGIN
        INSERT INTO users_bkp(name, email, phone, cpf, user_type_id) (
            SELECT name, email, phone, cpf, user_type_fd FROM users WHERE id = NEW.id
        );  
    END $$
DELINITER;
`

Agora com os nossos triggers criados, vamos testar para ver se de fato estão funcionando.
`
INSERT INTO users(name, email, phone, cpf, user_type_id) VALUES
('vitor', "VITOR@GMAIL.COM', '115511999099999', '11122233312', 2);
SELECT * FROM users WHERE email = 'vitor@gmail.com';
SELECT * FROM users_bkp WHERE email = 'vitor@gmail.com';
`

## VIEW
ma view pode ser definida como uma tabela virtual baseada no conjunto do resultado de uma consulta SQL, criada a partir dos dados de uma ou diversas tabelas. 
la possui linhas e colunas como qualquer outra tabela e pode receber comandos de CONDIÇOES, JOINS e FUNCTIONS.

A sintaxe de criação, alteração e deleção de uma view é bem simples.
`
CREATE VIEW nome_da_view AS consultaSQL;
ALTER VIEW nome_da_view AS consultaSQL;
DROP VIEW nome_da_view;
`
Para utiliza-las, basta aplicar a estrutura básica de uma consulta SQL.
`SELECT * FROM nome_da_view;`

Agora que você já aprendeu sobre views, está na hora de praticar um pouco.
Para esse treinamento, faça uma view que:

a) Retorne todos os dados dos usuários que possuam uma assinatura, contendo sua respectiva data, tipo da assinatura contratada e período permitido de acesso.
`
CREATE VIEW subscribed_users AS SELECT
u.id,
u.name,
u.email,
u.phone,
u.cpf,
ut.name AS user_type,
st.name AS subscription_type,
s.dt_subscription AS subscription_date,
st.access_days
FROM users u
INNER JOIN user_type ut ON ut.id = u.user_type_id
INNER JOIN subscriptions s ON u.id = s.user_id
INNER JOIN subscription_type st ON st.id = s.subscription_type_id;
`

`SELECT * FROM subscribed_users;`
`SELECT * FROM subscribed_users WHERE subscription_type = 'Full Stack Path';`
`SELECT
    subscription_type,
    COUNT(*) AS users
FROM subscribed_users GROUP BY subscription_type;`