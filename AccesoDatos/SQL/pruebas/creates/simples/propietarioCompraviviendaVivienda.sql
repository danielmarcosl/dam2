create table if not exists propietario (
nif varchar(10),
nombre varchar(30),
edad smallint(3) default 20,
sueldo int(5) default 2000,
primary key(nif));

create table if not exists vivienda (
codigo smallint(3) auto_increment,
direccion longtext not null,
tipo varchar(30) default 'piso',
primary key(codigo));

create table if not exists compravivienda (
nif varchar(10),
codigo smallint(3),
precio int(5),
primary key(nif,codigo),
constraint fk_nif foreign key (nif) references propietario(nif));