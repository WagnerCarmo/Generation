create database db_rh;

use db_rh;

create table tb_funcionarios(
   id bigint(5) auto_increment, 
   nome varchar(100)not null,
   cargo varchar(100)not null,
   salario decimal(10,2),
   faltas int,
   nascimento date,
   primary key(id)
   );

insert into tb_funcionarios (nome, cargo, salario, faltas, nascimento) VALUES ("Maria", "Assistente", "1300.00", "2", "1993-05-09");
insert into tb_funcionarios (nome, cargo, salario, faltas, nascimento) VALUES ("José", "Eletricista", "2200.00", "5", "1990-04-09");
insert into tb_funcionarios (nome, cargo, salario, faltas, nascimento) VALUES ("Joana", "Secretária", "1500.00", "9", "2000-07-23");
insert into tb_funcionarios (nome, cargo, salario, faltas, nascimento) VALUES ("Carlos", "Vendedor", "3000.00", "1", "1996-12-19");
insert into tb_funcionarios (nome, cargo, salario, faltas, nascimento) VALUES ("Pedro", "Vendedor", "3000.00", "3", "1989-11-15");

SELECT * FROM db_rh.tb_funcionarios;

SELECT * FROM tb_funcionarios where salario>2000.00;

SELECT * FROM tb_funcionarios where salario<2000.00;

Update tb_funcionarios set salario = 1700.00
where id = 3;



