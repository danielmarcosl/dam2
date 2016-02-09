/* Creamos las tablas, propietario con on delete restrict */
create table if not exists casa3 (
cod_casa smallint(2) primary key auto_increment,
nombre varchar(20) not null,
antiguedad integer,
constraint ck_casa3_antiguedad check (antiguedad between 1 and 10)
);

create table if not exists propietario3 (
dni varchar(10) primary key,
nombre varchar(20) not null,
cod_casa smallint(2) not null,
constraint fk_propietario3_cod_casa foreign key (cod_casa) references casa3(cod_casa) on delete restrict
);

/* Insertamos valores */
insert into casa3 values (null,'Pedro blanco',5),(null,'Juan verde',4),
(null,'Sonia amarilla',3),(null,'Ana rosa',10),(null,'Julian negro',4),
(null,'Ernesto rojo',9);

insert into propietario3 values ('39701709','Pedro blanco',1),('39702709','Juan verde',4),
('39709701','Sonia amarilla',1),('40701709','Ana rosa',6),('40709701','Julian negro',2),
('38669701','Ernesto rojo',3);

/* Comprobamos que se han introducido correctamente */
select * from casa3;
select * from propietario3;


/* Borrar la fila de casa cuyo nombre sea Ana rosa, dara error */
delete from casa3 where nombre = 'Ana rosa';
/* Borrar la fila de casa cuyo nombre sea cod_casa sea 5, es el unico valor que no esta en uso */
delete from casa3 where cod_casa = 5;

/* Ver que se ha modificado en la tabla propietario */
select * from casa3;
select * from propietario3;