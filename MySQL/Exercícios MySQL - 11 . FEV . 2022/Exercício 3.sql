create database db_escola;

use db_escola;

create table tb_alunos(
   id bigint(5) auto_increment, 
   nome varchar(100)not null,
   turma char,
   faltas int,
   media_notas decimal (2,1),
   disciplina varchar(100),
   primary key(id)
   );

insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Maria", "A", "5", "8.9", "Matemática");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Jão", "B", "2", "3.8", "Geografia");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Mano", "B", "6", "2.5", "português");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Brown", "C", "5", "9", "Matemática");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Tomás", "D", "3", "7.6", "História");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Igor", "B", "5", "4", "Matemática");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Izabel", "C", "8", "9.3", "Física");
insert into tb_alunos (nome, turma, faltas, media_notas, disciplina) VALUES ("Gertrudes", "A", "4", "7.3", "Matemática");

SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos where media_notas>7;

SELECT * FROM tb_alunos where media_notas<7;

Update tb_alunos set media_notas = 4.1
where id = 2;
