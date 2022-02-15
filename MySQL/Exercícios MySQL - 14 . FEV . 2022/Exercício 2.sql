create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias(
    id bigint auto_increment,
    tipo varchar(100) not null,
    tamanho varchar(100),
    preço decimal(10,2),
    primary key(id)       
    );
    
select * from tb_categorias;
    
insert into tb_categorias (tipo, tamanho, preço) values ("Salgada", "Média", 32.00);

insert into tb_categorias (tipo, tamanho, preço) values ("Doce", "Média", 39.00);

insert into tb_categorias (tipo, tamanho, preço) values ("Salgada", "Grande", 46.00);

insert into tb_categorias (tipo, tamanho, preço) values ("Doce", "Grande", 52.00);

insert into tb_categorias (tipo, tamanho, preço) values ("Vegana", "Média", 37.00);

select * from tb_categorias;

create table tb_pizza(
    id bigint auto_increment,
    sabor varchar(100) not null,
    borda varchar(100) not null,
    azeitona_morando varchar(100) not null,    
    tempo_preparo varchar(100),
    bebida varchar(100) not null,
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_categorias (id)  
    );

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Calabresa", "Catupiry", "preta", "Trinta Minutos", "Soda", 1);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Brigadeiro", "Doce de Leite", "Morango", "Quanrenta Minutos", "Fanta Uva", 2);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Portuguesa", "Cheddar", "Verde", "Trinta Minutos", "Fanta Laranja", 1);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Folhas Tropicais", "Goiabada", "Verde", "38 Minutos", "Dolly Cola", 3);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Quato Queijos", "Catupiry", "Preta", "Trinta Minutos", "Fanta Laranja", 1);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Prestígio", "Chocolate", "Morango", "Quanrenta Minutos", "Pspsi", 2);

insert into tb_pizza(sabor, borda, azeitona_morando, tempo_preparo, bebida, classe_id) values ("Frango com Catupiry", "Cheddar", "preta", "Trinta Minutos", "Soda", 1);

select * from tb_pizza;

select * from tb_categorias where preço > 45.00;

select * from tb_categorias where preço between 29.00 and 60.00;

select * from tb_pizza where Sabor like "%C%";

select * from tb_pizza inner join tb_categorias

on tb_pizza.classe_id = tb_categorias.id

where tb_categorias.id = 2;