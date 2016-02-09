create table if not exists proveedor (
dni integer not null primary key,
nombre varchar (40) not null,
direccion char (25),
ciudad char (30)
);

create table if not exists pieza (
codigo varchar(3) not null primary key,
descr varchar(40) not null,
color char(20),
peso float,
fechacompra date,
fechaventa date,
constraint r1 check (color<> 'rojo' or peso>100),
constraint r2 check (color IN ('verde','azul','naranja')), 
constraint r3 check (fechaventa < fechacompra) 
);

create table if not exists suministro (
dni integer not null,
codigo varchar (3),	
precio float,
primary key (dni, codigo),
index (codigo),
index (dni),
foreign key (codigo) references pieza (codigo),
foreign key (dni) references proveedor(dni)
);

create table if not exists personas_empresa (
dni_p integer not null primary key,
nombre varchar (40) not null,
direccion char (25),
ciudad char (30),
telefono char (9)
);

insert into proveedor values
(01234,'Federico','Calle de la presa','Madrid'),
(67152,'Panikero','Calle de la catarata','Madrid'),
(48614,'Golondrino','Puerto de la gaviota','Murcia');

insert into pieza values
('01A','Tornillo comun','rojo',0.5,'2012-01-01','2012-02-02'),
('02D','Broca del 8','azul',1.3,'2012-02-02','2012-03-03'),
('03E','Trocola','naranja',2.88,'2012-03-03','2012-04-04');

insert into suministro values
(01234,'01A',1.05),
(67152,'02D',1.1),
(48614,'03E',2.88);

insert into personas_empresa values
(51434,'Federico','Calle del cunaooo','Parla',912345678),
(61113,'Panikero','Calle de las cucarachas','Andalucia',745761328),
(48424,'Golondrino','Puerto de las ratas','Euskal Herria',197654892);