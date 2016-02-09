/* Crear tabla */
create table if not exists eje2 (
cod integer primary key auto_increment,
descrp varchar(30)
);

/* Insertar datos, modificar auto_increment */
set @@auto_increment_increment = 5;
alter table eje2 auto_increment = 5;

insert into eje2 values (null,'hola'),(null,'por'),(null,'la');

set @@auto_increment_increment = 1;
alter table eje2 auto_increment = 100;

insert into eje2 values (null,'carretera'),(null,'adios');

/* Select de datos introducidos */
select * from eje2;