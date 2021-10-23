CREATE DATABASE db_ecommerce;
USE db_ecommerce;
CREATE TABLE tb_produtos(
id_produtos INT AUTO_INCREMENT,
nome VARCHAR(255),
tipo VARCHAR(255),
cor VARCHAR(255),
preco Double NOT NULL,
PRIMARY KEY(id_produtos)

);

use db_ecommerce;
INSERT INTO tb_produtos(nome,tipo,cor,preco) VALUES
("SEAWAY", "CAMISA","FLORIDA",199.99),
("LACOSTE","CUECA","VERDE",59.99),
("NAICE","CALÇA","VERMELHA",299.99),
("PUMA","TÊNIS","BRANCO",499.99),
("SÓ JÓIAS","ANEL","DOURADO",799.99),
("KALVIN KLEINE","PULSEIRA","ROXO",99.99),
("SUKATA","ÓCULOS","AMARELO",29.99),
("NOSSA","CINTO","ROSA",79.99);

SELECT * FROM tb_produtos WHERE preco<500.00;
SELECT * FROM tb_produtos WHERE preco>500.00;

USE db_ecommerce;
UPDATE tb_produtos SET preco = 160.99 WHERE id_produtos = 1;

