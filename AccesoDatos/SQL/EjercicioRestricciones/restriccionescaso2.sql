/* Creamos las tablas, propietario con on delete cascade */
create table if not exists casa2 (
cod_casa smallint(2) primary key auto_increment,
nombre varchar(20) not null,
antiguedad integer,
constraint ck_casa2_antiguedad check (antiguedad between 1 and 10)
);

create table if not exists propietario2 (
dni varchar(10) primary key,
nombre varchar(20) not null,
cod_casa smallint(2) not null,
constraint fk_propietario2_cod_casa foreign key (cod_casa) references casa2(cod_casa) on delete cascade
);

/* Insertamos valores */
insert into casa2 values (null,'Pedro blanco',5),(null,'Juan verde',4),
(null,'Sonia amarilla',3),(null,'Ana rosa',10),(null,'Julian negro',4),
(null,'Ernesto rojo',9);

insert into propietario2 values ('39701709','Pedro blanco',1),('39702709','Juan verde',4),
('39709701','Sonia amarilla',1),('40701709','Ana rosa',6),('40709701','Julian negro',2),
('38669701','Ernesto rojo',3);

/* Comprobamos que se han introducido correctamente */
select * from casa2;
select * from propietario2;

/* Borrar la fila de casa cuyo nombre sea Ana rosa */
delete from casa2 where nombre = 'Ana rosa';

/* Ver que se ha modificado en la tabla propietario */
select * from casa2;
select * from propietario2;