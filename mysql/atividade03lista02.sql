CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    cliente VARCHAR(255) NOT NULL,
    tipo_produto ENUM ('Cosmético','Remédio'),
    PRIMARY KEY (id_categoria)

);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    marca VARCHAR(255) NOT NULL,
     valor DOUBLE NOT NULL,
      fk_id_categoria INT,
       PRIMARY KEY (id_produto),
       FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)

);

INSERT INTO tb_categoria (cliente, tipo_produto) VALUES
("Barbara", "Cosmético"),
("Maria Luiza", "Remédio"),
("Mayara", "Remédio"),
("Danillo", "Cosmético"),
("Cecilia", "Remédio");

SELECT * FROM tb_categoria;
INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) VALUES
('bicabonato',1, 'farmacol', 60.00,1),
('cetaconazol',1, 'farmacol',17.80,2),
('harbo', 2, 'avon',150.00,1),
('camisinha',1,'jontex',3.00,2),
('escova',3,'colgate', 60.00,2);

SELECT * FROM tb_produto;

SELECT*FROM tb_produto WHERE valor > 50.00;

 SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 60.00 ;

SELECT * FROM tb_produto WHERE nome LIKE 'b%';	

 SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_categoria INNER JOIN tb_produto
ON tb_produto.fk_id_categoria = tb_categoria.id_categoria WHERE id_categoria = 2;