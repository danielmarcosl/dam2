create table if not exists persona (
dni varchar(10) primary key,
nombre varchar(30) not null,
sexo char(1) default 'M',
unique(nombre));

create table if not exists producto (
codigo smallint(3) auto_increment primary key,
descripcion longtext not null,
fechaventa date not null);

create table if not exists compra (
dni varchar(10),
codigo smallint(3),
primary key (dni, codigo),
constraint fk_dni foreign key (dni) references persona(dni),
constraint fk_codigo foreign key (codigo) references producto(codigo));