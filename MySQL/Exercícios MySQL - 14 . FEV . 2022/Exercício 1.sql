create database db_game_online;

use db_game_online;

create table tb_classes(
     
     id bigint auto_increment,
     nome varchar(100) not null,
     habilidade varchar(100),
     arma varchar(100),
     primary key(id)       
     );
     
insert into tb_classes (nome, habilidade, arma) values ("Feiticeiro", "Bola de fogo", "Cajado");

insert into tb_classes (nome, habilidade, arma) values ("Arqueiro", "Chuva de Flechas", "Arco e Flecha");

insert into tb_classes (nome, habilidade, arma) values ("Druida", "Gelo e Cura", "Livro");

insert into tb_classes (nome, habilidade, arma) values ("Guerreiro", "Excalibur", "Espada");

insert into tb_classes (nome, habilidade, arma) values ("Curandeiro", "Ressurreição", "poção");

select * from tb_classes;

create table tb_personagens(
    id bigint auto_increment,
    nome varchar(100) not null,
    nivel int,
    ataque int, 
    defesa int,
    classe_id bigint,
    primary key(id),
    foreign key(classe_id) references tb_classes (id)  
    );

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values("Caçapa", 7, 1900, 700, 1);

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values("Iron", 3, 2100, 600, 2);

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values("Maiden", 7, 1190, 360, 4);

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values("Carin", 5, 2400, 3290, 3);

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values("Mazembe",6, 1270, 500,5);

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens inner join tb_classes

on tb_personagens.classe_id = tb_classes.id

where tb_classes.id = 2;