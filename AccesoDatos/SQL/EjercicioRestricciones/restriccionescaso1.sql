/* Creamos las tablas, propietario con on delete set null */
create table if not exists casa (
cod_casa smallint(2) primary key auto_increment,
nombre varchar(20) not null,
antiguedad integer,
constraint ck_casa_antiguedad check (antiguedad between 1 and 10)
);

create table if not exists propietario (
dni varchar(10) primary key,
nombre varchar(20) not null,
cod_casa smallint(2), /* Modificamos la columna para que pueda ser null */
constraint fk_propietario_cod_casa foreign key (cod_casa) references casa(cod_casa) ON DELETE SET NULL
);

/* Insertamos valores */
insert into casa values (null,'Pedro blanco',5),(null,'Juan verde',4),
(null,'Sonia amarilla',3),(null,'Ana rosa',10),(null,'Julian negro',4),
(null,'Ernesto rojo',9);

insert into propietario values ('39701709','Pedro blanco',1),('39702709','Juan verde',4),
('39709701','Sonia amarilla',1),('40701709','Ana rosa',6),('40709701','Julian negro',2),
('38669701','Ernesto rojo',3);

/* Comprobamos que se han introducido correctamente */
select * from casa;
select * from propietario;

/* Borrar la fila de casa cuyo cod_casa sea 1 */
delete from casa where cod_casa = 1;

/* Ver que se ha modificado en la tabla propietario */
select * from casa;
select * from propietario;