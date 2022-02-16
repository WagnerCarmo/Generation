create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
    id bigint auto_increment,          
    Tipo varchar(100) not null,
    Lugar varchar(100),
    Entrada date,
    primary key(id)        
    );
    
select * from tb_categoria;
    
insert into tb_categoria (Tipo, Lugar, Entrada) values ("Higiene", "Corredor 1", "2022-01-05");

insert into tb_categoria (Tipo, Lugar, Entrada) values ("Medicamentos", "Balcão", "2022-01-20");

insert into tb_categoria (Tipo, Lugar, Entrada) values ("Cosmético", "Corredor 2", "2022-01-25");

insert into tb_categoria (Tipo, Lugar, Entrada) values ("Suplementos & Fitness", "Corredor 3", "2022-02-04");

insert into tb_categoria (Tipo, Lugar, Entrada) values ("Conveniência", "Caixa", "2022-02-13");

create table tb_produto(
    id bigint auto_increment,
    nome varchar(100) not null,
    marca varchar (100) not null,
    quantidade varchar(100) not null,    
    validade date,
    preço decimal(10,2),
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_categoria (id)  
    );

insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Preservativo", "Olla", "Pct 8 Unids", 11.90, "2023-05-13", 1);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Baton", "Vult", "1 Unid", 10.80, "2022-09-13", 3);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Dipirona Liq.", "NeoQuimica", "1 Unid", 4.90,"2023-08-23", 2);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Shampoo", "Dove", "1 Unid", 13.90, "2024-03-28", 1);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Shampoo", "Palmolive", "1 Unid", 8.50, "2024-04-08", 1);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Esmalte", "Vult", "1 Unid", 4.50, "2024-12-18", 3);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Amoxilina", "EMS", "Cx.30 Caps", 49.90, "2025-02-01", 2);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Cimegripe", "Cimed", "Cx.20 Caps", 12.80, "2024-06-11", 2);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Chiclete", "Tridente", "1 Unid", 2.90, "2023-07-15", 5);
insert into tb_produto(nome, marca, quantidade, preço, validade, classe_id) values ("Whey Protein", "Maxx", "1 Unid", 120.00, "2025-01-09", 4);

select * from tb_produto;

select * from tb_produto where preço > 45.00;

select * from tb_produto where preço between 3.00 and 60.00;

select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria

on tb_produto.classe_id = tb_categoria.id;

