/* Crear tabla */
create table if not exists eje3 (
id integer primary key auto_increment,
telf integer not null
);

/* Insertar datos, modificar auto_increment */
alter table eje3 auto_increment = 1;

insert into eje3 values (null,16565234),(null,56712318),(null,41414551);

alter table eje3 auto_increment = 100;

insert into eje3 values (null,13123125),(null,43563633);

alter table eje3 auto_increment = 200;

insert into eje3 values (null,11241244),(null,31231212);

/* Select de datos introducidos */
select * from eje3;