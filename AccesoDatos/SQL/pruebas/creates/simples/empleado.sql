create table if not exists emp (
nss smallint(10) primary key,
dni varchar(10) not null unique,
nombre varchar(30) not null unique,
edad smallint(2) default 18,
sexo char(6) default 'hombre',
sueldo smallint(5) default 2000,
clave smallint(10) not null,
constraint fk_clave foreign key (clave) references emp(nss));