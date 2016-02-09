create table if not exists usuario(
carnet varchar(10) primary key,
nombre varchar(20) unique,
direccion varchar(30));

create table if not exists clase(
clave smallint(3) primary key,
tiempo_de_prestamo smallint(3),
constraint ck_clase_prestamo check (prestamo <= 30));

create table if not exists libro (
signatura varchar(10) primary key,
autor varchar(20) unique,
titulo varchar(20) unique,
editor varchar(20),
clave smallint(3) not null,
constraint fk_libro_clave foreign key (clave) references clase(clave));

create table if not exists prestamo(
signatura varchar(10),
carnet varchar(10),
fecha_inicio date,
fecha_fin date,
primary key(signatura, carnet),
constraint ck_prestamo_fechas check (fecha_inicio < fecha_fin),
constraint fk_prestamo_signatura foreign key (signatura) references libro(signatura),
constraint fk_prestamo_carnet foreign key (carnet) references usuario(carnet));
