create table if not exists libreria (
cod_libreria smallint(5) auto_increment,
nombre_libreria text,
direccion varchar(20),
primary key (cod_libreria));

create table if not exists cliente (
dni varchar(10),
nombre varchar(30) unique,
edad smallint(2) not null default 18,
sexo char(1) not null,
primary key (dni));

create table if not exists compralibros (
cod_libreria smallint(5),
dni varchar(10),
fecha date not null default '2015-11-14',
cantidad smallint(3),
primary key (cod_libreria,dni),
constraint fk_cod_libreria foreign key (cod_libreria) references libreria(cod_libreria),
constraint fk_dni_cliente foreign key (dni) references cliente(dni));