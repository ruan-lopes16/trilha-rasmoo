/* CRIANDO BANCO */
CREATE DATABASE rasmoo;

USE rasmoo;

/* CRIANDO TABELAS */

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
    /* relacionamento */
    user_type_id INT NOT NULL,
    FOREIGN KEY(user_type_id) REFERENCES user_type(id) /* 'user_type_id faz' referencia a outra tabela chamada de 'user_type', que tem um atributo 'id'*/
);


/* fazer resto das tabelas */

/* INSERINDO REGISTROS */
/* como não passei o nome das colunas, eu preciso escrever todas as colunas */
INSERT INTO user_type VALUES(null, 'ALUNO', null);
INSERT INTO user_type VALUES(null, 'PROFESSOR', null);
INSERT INTO user_type VALUES(null, 'ADMINISTRADOR', null);

/* colocando valores apenas nas colunas 'name' e 'access_days' */
INSERT INTO subscription_type(name, access_days) VALUES ('Java Path', 120);
INSERT INTO subscription_type (name, access_days) VALUES('Javascript Path', 60);
INSERT INTO subscription_type (name, access_days) VALUES('Full Stack Path', 90);

/* inserir várias linhas em uma tabela em um único comando
posso declarar ou não as colunas que quero inserir as novas informações */
INSERT INTO users (name, email, phone, cpf, user_type_id) VALUES
  ('Ana Luisa', 'analuisa@gmail.com', '5521999999901', '11122233301', 1),
  ('Vanessa', 'vanessa@gmail.com', '5521999999902', '11122233302', 1),
  ('Marcos', 'marcos@gmail.com', '5521999999903', '11122233303', 1), 
  ('Yuri', 'yuri@gmail.com', '5521999999906', '11122233306', 1), 
  ('Matheus', 'matheus@gmail.com', '5521999999907', '11122233307', 1), 
  ('Mario', 'mario@gmail.com', '5521999999908', '11122233308', 1), 
  ('Larissa', 'larissa@gmail.com', '5521999999909', '11122233309', 1), 
  ('Vinicios', 'vinicios@gmail.com', '5521999999910', '11122233310', 1),
  ('Patricia', 'patricia@gmail.com' , '5521999999911', '11122233311', 1),
  ('Mauricio', 'mauricio@gmail.com' , '5521999999912', '11122233312', 1),
  ('Pedro Henrique', 'pedro@gmail.com', '5521999999904', '11122233304', 2), 
  ('Felipe', 'felipe@gmail.com', '5521999999905', '11122233305', 3);
  
/* ALTERANDO REGISTROS */
INSERT INTO courses (name, certificate_hours, dt_creation) VALUES
	('HTTP Protocol', 10, CURDATE()), 
	('MyySQqL', 18, CURDATE()), /*erro*/
	('Java Bsic', 20, CURDATE()), /*erro*/
	('Java Advanced', 40, CURDATE()), 
	('Sping B0ot', 100, CURDATE()), /*erro*/
	('Spring Data JPA', 25, CURDATE()) , 
	('Spring Security', 30, CURDATE()), 
	('Angular Advanced', 50, CURDATE()) ,
	('Build your backend with NodeJS', 30, CURDATE()), 
	('Applications with NextJS', 40, CURDATE());

UPDATE courses SET name = 'MySQL' WHERE id = 2; /*corrigido por 'name' e 'id' da tabela 'course'*/ 
UPDATE courses SET name = 'Java Basic' WHERE name = 'Java Bsic'; /*corrigido por 'name' e 'name' incorreto, da tabela 'course'*/
UPDATE courses SET name = 'Spring Boot' WHERE name = 'Sping B0ot'; /*corrigido*/

/* EXCLUINDO REGISTROS */
/* Delete o usuário que possui o id de número 7 */
DELETE FROM users WHERE id = 7;

/* Delete todos os usuários que comecem com as letras "Ma" */
DELETE FROM users WHERE name LIKE 'Ma%';

/* CONSULTA */
/* Retorne todos os dados do usuário que se chama Pedro Henrique. */
SELECT * FROM users WHERE name = 'Pedro Henrique';
/* Retorne os nomes de todos os usuários que possuam a coluna “user_type_id” igual a 1. */
SELECT name FROM users WHERE user_type_id = 1;

/* SUBCONSULTA OU SUBQUERY */
/* Retorne todos os usuários que possuam uma assinatura */
SELECT * FROM users WHERE id IN (SELECT user_id FROM subscriptions);
/* Retorne todos os usuários que sejam do tipo ”ADMINISTRADOR”. */
SELECT * FROM users WHERE user_type_id = (
	SELECT id FROM user_type WHERE name = 'ADMINISTRADOR'
 );
 
/* Delete todos os usuários que sejam do tipo ”PROFESSOR”. */
DELETE FROM users WHERE user_type_id = (
	SELECT id FROM user_type WHERE name = 'PROFESSOR'
 );
/* Salve em uma outra tabela as informações “name”, “email”, “phone”, “cpf” e “user_type_id” de todos os usuários cadastrados na tabela “users”. */
INSERT INTO users_bkp(name, email, phone, cpf, user_type_id) (
	SELECT name, email, phone, cpf, user_type_id FROM users
 );
 SELECT * FROM users_bkp;
 
 /* COMBINANDO TABELAS */
 /* Retorne o nome e o tipo de todos os usuários */
 SELECT u.name, ut.name AS type FROM users u
	INNER JOIN user_type ut ON ut.id = u.user_type_id;
/* Retorne todos os usuários que possuam uma assinatura */
SELECT u.* FROM users u
	INNER JOIN subscriptions s ON u.id = s.user_id;
/* Retorne o nome, cpf, o tipo e a data de assinatura de todos os usuários que possuam uma assinatura. */
SELECT u.name, u.cpf, st.name AS type, s.dt_subcription FROM users u
	INNER JOIN subscriptions s ON u.id = s.user_id
	INNER JOIN subscription_type st ON s.subscription_type_id = st.id;
/* Retorne todos os dados dos usuários e sua respectiva data de assinatura. Caso o usuário não possua uma assinaturam a query deverá retorna _NULL_ na coluna "dt_subscription" */
SELECT u.*, s.dt_subscription FROM users u
	LEFT JOIN subscriptions s ON u.id = s.user_id;