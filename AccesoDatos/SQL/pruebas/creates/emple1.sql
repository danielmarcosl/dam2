create table if not exists emple1 (
dni varchar(10) primary key,
nombre varchar(30) not null,
sexo char(1) not null,
constraint ck_emple_sexo check(sexo='H' or sexo='M'));