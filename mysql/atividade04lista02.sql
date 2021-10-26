CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
id_categoria INT AUTO_INCREMENT,
 cliente VARCHAR(255) NOT NULL,
 tipo_fruta ENUM ('seca','carnosa'),
 PRIMARY KEY(id_categoria)
);


CREATE TABLE tb_produto(
id_produto INT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
quantidade INT NOT NULL,
marca VARCHAR(255) NOT NULL,
valor DOUBLE NOT NULL,
  fk_id_categoria INT,
   PRIMARY KEY (id_produto),
   FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (cliente, tipo_fruta) VALUES

('Beatriz', 'seca'),
('Arthur', 'carnosa'),
('Padilha', 'carnosa'),
('Malu', 'seca'),
('Aldair','carnosa');

SELECT * FROM tb_categoria;
INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) VALUES
('Melancia',2, 'horta da vovó', 12.50,2),
('melão', 1, 'horta comunidade prazeres city', 3.00, 2),
('castanha',1, 'Castanhas do pará', 60.00,1),
('amendoin', 1, 'só força',15.00,1),
('goiaba',2,'goiabadas e cia', 17.00,2);

SELECT * FROM tb_produto;

SELECT*FROM tb_produto WHERE valor > 50.00;

SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 60.00 ;

SELECT * FROM tb_produto WHERE nome LIKE 'c%';	

SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria WHERE id_categoria = 2;
