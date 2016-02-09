create table if not exists ejercicio (
codigo smallint(5) not null auto_increment primary key,
cif varchar(30) not null unique,
nombre varchar(30) not null unique,
direccion longtext,
fecha date default '2016-01-01',
telefono smallint(9) default 91);