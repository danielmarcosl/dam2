create table categorias(
categoriaid numeric(3) primary key,
nombrecat varchar(20));

create table productos(
productoid numeric(3) primary key,
categoriaid numeric(3) references categorias(categoriaid),
descripcion varchar(80),
existencia numeric(3));