create table if not exists departamento (
cod_dept smallint(3) primary key,
nombre varchar(30),
planta smallint(2) default 1,
edificio smallint(2));

create table if not exists trabajador (
dni varchar(10) primary key,
nombre varchar(30) not null,
edad smallint(2) default 18,
sexo char(1) default 'H',
cod_dept smallint(3),
constraint fk_cod_dept foreign key (cod_dept) references departamento(cod_dept));