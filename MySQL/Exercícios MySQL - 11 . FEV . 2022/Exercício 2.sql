create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
   id bigint(5) auto_increment, 
   marca varchar(50)not null,
   cor varchar(50)not null,
   tamanho_lata varchar(50),  
   validade date,
   preco decimal(10,2),
   primary key(id)
   );

insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Suvinil", "vermelho", "grande", "2022-12-01", 600.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Lukscolor", "azul", "media", "2022-08-10", 200.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Coral", "gelo", "grande", "2022-11-20", 250.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Suvinil", "verde", "media", "2022-12-01", 400.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Eucatex", "amarelo", "grande", "2022-06-21", 450.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Lukscolor", "roxo", "media", "2022-11-14", 220.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Anjo", "branco", "grande", "2022-04-11", 430.00);
insert into tb_produtos (marca, cor, tamanho_lata, validade, preco) VALUES ("Sherwin Williams", "vermelho", "pequena", "2022-05-18", 180.00);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos where preco>500.00;

SELECT * FROM tb_produtos where preco<500.00;

Update tb_produtos set preco = 150.00
where id = 8;

