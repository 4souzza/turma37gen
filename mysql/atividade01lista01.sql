create database db_rh;
USE db_rh;
CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR (255),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE NULL,
    PRIMARY KEY (id_funcionario)
    
);

INSERT INTO tb_funcionarios(nome,email,cargo,salario) VALUES
("ARTHUR","reizinhodaAmbev@hotmail.com","Diretor geral", 10000.00),
("ÁLYSSON","alyssinho@gmail.com","DEGUSTADOR",1000),
("AMANCIO","amancin@gmail.com","DESIGNER",5000.00),
("BRUNA","fadasensata@hotmail.com","conselheira geral",12000),
("FERNANDA","openhouse@gmail.com","Diretora de eventos",5000)
;
SELECT * FROM tb_funcionarios WHERE salario>2000;
SELECT * FROM tb_funcionarios WHERE salario<2000;

USE db_rh;
UPDATE tb_funcionarios SET salario = 1000.00 WHERE id_funcionario= 2;