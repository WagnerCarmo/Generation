create database db_curso_da_minha_vida;

use db_curso_da_minha_vida;

create table tb_categoria(
     id bigint auto_increment,
     Classificação varchar(100)not null,
     Seção varchar(100)not null,     
     Metodologia varchar(100)not null,
     primary key(id)       
     );
     
insert into tb_categoria (Classificação, Seção, Metodologia) values ("Pós-Gradução", "Marketing", "Híbrido");
insert into tb_categoria (Classificação, Seção, Metodologia) values ("livre", "Idiomas", "Híbrido"); 
insert into tb_categoria (Classificação, Seção, Metodologia) values ("Técnico", "Informática", "Video Conferência");
insert into tb_categoria (Classificação, Seção, Metodologia) values ("Preparatório", "Concursos", "Assíncrono");
insert into tb_categoria (Classificação, Seção, Metodologia) values ("Profissionalizante", "Saúde e Estética", "Assíncrono");

select * from tb_categoria;

create table tb_produto(
    id bigint auto_increment,
    Nome varchar(100) not null,
    Nível varchar(100),
    Duração varchar(100),
    Data_de_Início date,
    Preço decimal(10,2),
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_categoria(id)  
    );
    
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Mídias Digitais", "MBA", "9 Meses", "2022-03-01", 4999.90, 1);
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Francês", "Básico", "6 Meses", "2022-08-07", 990.00, 2);
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Inglês", "Avançado", "6 Meses", "2022-03-10", 2099.90, 2); 
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Excell", "Intermediário", "3 Semanas", "2022-04-03", 299.90, 3);
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Python", "Básico", "4 Semanas", "2022-03-22", 159.90, 3);   
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Técnicas de Redação", "Básico", "8 Dias", "2022-03-21", 49.90, 4);
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Design de Sobrancelha", "Básico", "2 Semanas", "2022-04-27", 79.90, 5);
    insert into tb_produto(Nome, Nível, Duração, Data_de_Início, Preço, classe_id) values("Marketing Esportivo", "MBA", "15 Meses", "2022-03-01", 4499.90, 1);

    select * from tb_produto;

    select * from tb_produto where Preço > 50.00;

    select * from tb_produto where Preço between 3.00 and 60.00;

    select * from tb_produto where Nome like "%J%";

    select * from tb_produto inner join tb_categoria on tb_produto.classe_id = tb_categoria.id;

    select * from tb_produto inner join tb_categoria on tb_produto.classe_id = tb_categoria.id where Classificação = ("Técnico");