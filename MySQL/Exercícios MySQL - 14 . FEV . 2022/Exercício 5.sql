create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
     id bigint auto_increment,
     Seção varchar(100)not null,
     Sub_seção varchar(100)not null,
     Lugar_estoque varchar(100)not null,
     primary key(id)       
     );
     
insert into tb_categoria (Seção, Sub_seção, Lugar_estoque) values ("Construção", "Cimentos e Argamassas", "Galpão");
insert into tb_categoria (Seção, Sub_seção, Lugar_estoque) values ("Pisos e Revestimentos", "Porcelanato", "Corredor A");
insert into tb_categoria (Seção, Sub_seção, Lugar_estoque) values ("Iluminação",  "Lâmpadas", "Corredor B");
insert into tb_categoria (Seção, Sub_seção, Lugar_estoque) values ("Hidráulica", "Chuveiros e Duchas", "Corredor C");
insert into tb_categoria (Seção, Sub_seção, Lugar_estoque) values ("Elétrica", "Tomadas", "Corredor D");

select * from tb_categoria;

create table tb_produto(
    id bigint auto_increment,
    Nome varchar(100) not null,
    Marca varchar(100),
    Descrição varchar(100),
    Estoque varchar(100) not null,
    Preço decimal(10,2),
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_categoria(id)  
    );
    
    insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Cimento Todas As Obras", "Votorantim", "50kg", "40 Unids", 29.90, 1);
    insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Porcelanato Esmaltado", "Portobello", "60x60", "90 Cxs", 42.90, 2);  
    insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Lâmpada Led Dicróica", "Empalux", "4,9w Bivolt", "55U nids", 18.90, 3);  
    insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Chuveiro Elétrico Top Jet", "Lorenzetti", "110v", "30 Unids", 119.90, 4);
    insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Conjunto Tomada 2p+", "Pial Legrand", "4x2 Preta", "47 Unids", 29.90, 5);
	insert into tb_produto(Nome, Marca, Descrição, Estoque, Preço, classe_id) values("Argamassa Cimentcola", "Quartzolit", "20kg", "60 Unids", 16.90, 1);
    
    select * from tb_produto;

    select * from tb_produto where Preço > 50.00;

    select * from tb_produto where Preço between 3.00 and 60.00;

    select * from tb_produto where Nome like "%C%";

    select * from tb_produto inner join tb_categoria
    on tb_produto.classe_id = tb_categoria.id;

    select * from tb_produto inner join tb_categoria
    on tb_produto.classe_id = tb_categoria.id
    where Seção = ("Hidráulica");