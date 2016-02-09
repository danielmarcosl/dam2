create table if not exists fabricante (
cod_fab smallint(2) auto_increment,
nombre varchar(30) not null,
edad smallint(2),
primary key(cod_fab),
constraint ck_fabricante_edad check (edad >= 0));

create table if not exists productos (
cod_prod smallint(3) primary key auto_increment,
nombre_prod varchar(30) not null unique,
cod_fab smallint(2) not null,
constraint fk_productos_cod_fab foreign key (cod_fab) references fabricante(cod_fab) on update cascade);

create table if not exists venden (
cod_fab smallint(2),
cod_prod smallint(3),
cantidad smallint(2) not null,
fecha date not null,
primary key (cod_fab,cod_prod),
constraint ck_venden_fecha check (fecha > 2011-01-01),
constraint fk_venden_cod_fab foreign key (cod_fab) references fabricante(cod_fab) on delete no action,
constraint fk_venden_cod_prod foreign key (cod_prod) references productos(cod_prod) on delete cascade);