/* Creamos las tablas */
create table if not exists producto (
cod_prod smallint(3) primary key auto_increment,
nombre varchar(15),
precio integer(3),
stock smallint(4),
constraint ck_producto_precio check (precio between 25 and 1200),
constraint ck_producto_stock check (stock <= 3600)
);
create table if not exists proveedor (
dnip integer(4) primary key auto_increment,
nombre varchar(20) not null,
direccion varchar(30) not null,
telefono int(9),
web char(2) not null,
cod_prod smallint(3) not null,
dnidis varchar(10),
constraint ck_proveedor_web check (web in ('si','no')),
constraint fk_proveedor_cod_prod foreign key (cod_prod)
references producto(cod_prod) on update cascade on delete cascade
);
create table if not exists cliente (
cod_clie smallint(3) primary key auto_increment,
nombre varchar(20) unique,
direccion varchar(30),
telefono int(9),
constraint ck_cliente_telefono check (telefono like '91%')
);
create table if not exists vende (
cod_clie smallint(3),
cod_prod smallint(3),
contidad smallint(3) default 10,
primary key (cod_clie,cod_prod),
constraint fk_vende_cod_clie foreign key (cod_clie)
references cliente(cod_clie) on update cascade on delete cascade,
constraint fk_vende_cod_prod foreign key (cod_prod)
references producto(cod_prod) on update cascade on delete cascade
);

/*Iniciamos los auto_increment*/
alter table producto auto_increment = 10;
alter table proveedor auto_increment = 3001;
alter table cliente auto_increment = 201;
/* Insertamos valores */
/* Usando un solo comando insert y sin especificar los campos en la tabla producto */
insert into producto values
(null,'Persianas',1000,10),
(null,'Cortinas',200,100),
(null,'Colchas',36,2000),
(null,'Sabanas',25,3500);

select * from producto;

/* Usando la especificacion de los campos antes de cada insert para la tabla proveedor */
insert into proveedor(dnip, nombre, direccion, telefono, web, cod_prod, dnidis)
values (null,'Juan','c/pez',null,'SI',13,'3003');
insert into proveedor(dnip, nombre, direccion, telefono, web, cod_prod, dnidis)
values (null,'Sara','c/gamba',913559798,'NO',11,null);
insert into proveedor(dnip, nombre, direccion, telefono, web, cod_prod, dnidis)
values (null,'Ramon','c/perro',91355999,'SI',12,'3004');
insert into proveedor(dnip, nombre, direccion, telefono, web, cod_prod, dnidis)
values (null,'Pedro','c/gallo',null,'NO',13,null);
insert into proveedor(dnip, nombre, direccion, telefono, web, cod_prod, dnidis)
values (null,'Sonia','c/canario',912992625,'Si',12,'3001');

select * from proveedor;

/* Usando la sintaxis set para la tabla cliente */
insert into cliente set 
cod_clie = null,nombre = 'Jose',direccion = 'c/hard',telefono = 915552325;
insert into cliente set 
cod_clie = null,nombre = 'Susana',direccion = 'c/softw',telefono = 913462789;
insert into cliente set 
cod_clie = null,nombre = 'Uxue',direccion = 'c/monitor',telefono = 912345678;
insert into cliente set 
cod_clie = null,nombre = 'Valeria',direccion = 'c/sistema',telefono = 916785439;

select * from cliente;

insert into vende values
(201,13,6),
(202,10,3),
(201,12,2),
(204,11,10),
(203,13,5);

select * from vende;