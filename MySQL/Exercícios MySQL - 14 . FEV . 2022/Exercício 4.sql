create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
    
    id bigint auto_increment,          
    seção varchar(100) not null,
    setor varchar(100),
    data_fornecedor date,
    primary key(id)        
    );
    
    select * from tb_categoria;
   
insert into tb_categoria (seção, setor, data_fornecedor) values ("Frutas", "Corredor 1", "2022-02-08");

insert into tb_categoria (seção, setor, data_fornecedor) values ("Verduras", "Corredor 2", "2022-02-13");

insert into tb_categoria (seção, setor, data_fornecedor) values ("Bebidas", "Geladeira", "2022-01-20");

insert into tb_categoria (seção, setor, data_fornecedor) values ("Congelados", "Corredor 3", "2022-01-09");

insert into tb_categoria (seção, setor, data_fornecedor) values ("Ovos", "Balcão", "2022-02-10");

create table tb_produto(
    id bigint auto_increment,
    nome varchar(100) not null,
    preço decimal(10,2),
    caixa varchar (100) not null,
    quantidade varchar(100) not null,    
    validade date,
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_categoria (id)  
    );
    
insert into tb_produto(nome, preço, caixa, quantidade, validade, classe_id) values ("Banana", 5.00, "Vanuza", "12 Unid", "2022-02-25", 1);
insert into tb_produto(nome, preço, caixa, quantidade, validade, classe_id) values ("Alface", 4.80, "Arnaldo", "1 Unid", "2022-02-20", 2);
insert into tb_produto(nome, preço, caixa, quantidade, validade, classe_id) values ("Guaraná Antártica 2L", 7.90, "Vanuza", "1 Unid", "2022-08-07", 3);
insert into tb_produto(nome, preço, caixa, quantidade, validade, classe_id) values ("Ovos Caipira", 16.00, "Arnaldo", "30 Unids", "2022-02-08", 5);
insert into tb_produto(nome, preço, caixa, quantidade, validade, classe_id) values ("Nuggets Sadia 400g", 14.90, "Vanuza", "1 Unid", "2022-05-10", 4);

select * from tb_produto;

select * from tb_produto where preço > 50.00;

select * from tb_produto where preço between 3.00 and 60.00;

select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria
on tb_produto.classe_id = tb_categoria.id;

select * from tb_produto inner join tb_categoria
on tb_produto.classe_id = tb_categoria.id
where seção = "Frutas";