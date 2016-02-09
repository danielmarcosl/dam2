create table if not exists cli (
dni varchar(10),
nombrecliente text,
primary key (dni));

create table if not exists prouno (
codigo smallint(4) auto_increment,
nombreproducto text,
primary key (codigo));

create table if not exists clicompra (
dni varchar(10),
codigo smallint(4),
cantidad smallint(2) null,
precio smallint(3) null,
primary key(dni,codigo),
constraint fk_dni1 foreign key (dni) references cli(dni),
constraint fk_codigo2 foreign key (codigo) references prouno(codigo));