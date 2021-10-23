CREATE DATABASE db_escola;
USE db_escola;
CREATE TABLE tb_aluno (
id_aluno INT AUTO_INCREMENT,
nome VARCHAR(255),
matricula VARCHAR(255),
cpf VARCHAR(255)NOT NULL,
nota DOUBLE NOT NULL,
PRIMARY KEY (id_aluno)
);

INSERT INTO tb_aluno(nome,matricula,cpf,nota)VALUES
("ARTHUR","123","827272662222",7.00),
("AMÂNCIO","456","22222222222",8.00),
("MARILIA","234","12345678911",10.00),
("RENATA","876","09876543210",6.00);

SELECT * FROM tb_aluno WHERE nota > 7;
SELECT * FROM tb_aluno WHERE nota < 7;
UPDATE tb_aluno SET nota = 9.00 WHERE id_aluno= 4;

SELECT * FROM tb_aluno;

