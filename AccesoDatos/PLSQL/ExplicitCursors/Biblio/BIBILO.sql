CREATE TABLE EDITORIAL
(CLAVEEDITORIAL number(4) PRIMARY KEY,
NOMBRE CHAR(20),
DIRECCION CHAR(20),
TELEFONO number (9));

insert into EDITORIAL values (200,'Alfaguara','c/pez',678342035);
insert into EDITORIAL values(201,'Planeta','c/perro',666444553);
insert into EDITORIAL values (202,'Santillana','c/gato',687543210);
insert into EDITORIAL values(203,'Pearson','c/ballena',635467890);
insert into EDITORIAL values(204,'Bruno','c/pajaro',666010666);

CREATE TABLE LIBRO
(CLAVELIBRO number (4) PRIMARY KEY,
TITULO CHAR(50),
IDIOMA CHAR(20),
CATEGORIA CHAR(20),
CLAVEEDITORIAL number(4));

ALTER TABLE LIBRO ADD FOREIGN KEY(CLAVEEDITORIAl)REFERENCES EDITORIAL(CLAVEEDITORIAL);

insert into LIBRO values(100,'El alma','Español','Primera',null);
insert into LIBRO values(101,'El perro del hortelano','Italiano','Segunda',201);
insert into LIBRO values(102,'Come bien','Español','Tercera',Null);
insert into LIBRO values(103,'Los tres','Frances','Primera',203);
insert into LIBRO values(104,'Orgullo y sensibilidad','Ingles','Tercera',204);

CREATE TABLE TEMA(
CLAVETEMA number(3) PRIMARY KEY,
NOMBRE CHAR(20),
CLAVEB number(3)
);

insert into TEMA values(10,'Ciencia',12);
insert into TEMA values(11,'Historia',10);
insert into TEMA values(12,'Aventura',null);
insert into TEMA values(13,'Gastronomia',13);

ALTER TABLE TEMA ADD FOREIGN KEY(CLAVEB)REFERENCES TEMA(CLAVETEMA);

CREATE TABLE AUTOR(
CLAVEAUTOR VARCHAR(20) PRIMARY KEY,
NOMBRE CHAR(20));

insert into AUTOR values('A100','Arguinano');
insert into AUTOR values('A200','Jane Austin');
insert into AUTOR values('A300','Julio Verne');

CREATE TABLE SOCIO(
CLAVESOCIO number(1) PRIMARY KEY,
NOMBRE CHAR(20),
DIRECCION CHAR(20),
TELEFONO number(9),
fecha_nac date);

insert into SOCIO values(1,'Pepe','C/verdura',913559799,to_date('10-10-1956','dd-mm-yyyy'));
insert into SOCIO values(2,'Sara','C/Coliflor',912992628,to_date('06-08-1976','dd-mm-yyyy'));
insert into SOCIO values(3,'Ramon','C/Esparrago',912345679,to_date('09-02-1995','dd-mm-yyyy'));

CREATE TABLE PRESTAMO(
CLAVESOCIO number(1),
CLAVELIBRO number (4),
FECHA_P DATE,
FECHA_D DATE,
NOTAS CHAR(20),
PRIMARY KEY( CLAVESOCIO,CLAVELIBRO));

insert into PRESTAMO values(1,100,null,to_date('15-02-2010','dd-mm-yyyy'),'Bien');
insert into PRESTAMO values(2,103,to_date('01-03-2010','dd-mm-yyyy'),to_date('15-03-2010','dd-mm-yyyy'),'Hojas rotas');
insert into PRESTAMO values(3,102,to_date('15-09-2010','dd-mm-yyyy'),null,'Bien');
insert into PRESTAMO values(1,101,to_date('05-11-2010','dd-mm-yyyy'),to_date('20-11-2010','dd-mm-yyyy'),'Manchado');

ALTER TABLE PRESTAMO ADD FOREIGN KEY(CLAVESOCIO) REFERENCES SOCIO(CLAVESOCIO);
ALTER TABLE PRESTAMO ADD FOREIGN KEY(CLAVELIBRO) REFERENCES LIBRO(CLAVELIBRO);

CREATE TABLE TRATA_SOBRE(
CLAVELIBRO number(4),
CLAVETEMA number(3),
PRIMARY KEY(CLAVELIBRO,CLAVETEMA));

insert into TRATA_SOBRE values(100,10);
insert into TRATA_SOBRE values(101,11);
insert into TRATA_SOBRE values(102,13);
insert into TRATA_SOBRE values(103,12);
insert into TRATA_SOBRE values(104,12);

ALTER TABLE TRATA_SOBRE ADD FOREIGN KEY(CLAVELIBRO)REFEReNCES LIBRO(CLAVELIBRO);

ALTER TABLE TRATA_SOBRE ADD FOREIGN KEY(CLAVETEMA)REFEReNCES TEMA(CLAVETEMA);

CREATE TABLE ESCRITO_POR(
CLAVELIBRO number(4),
CLAVEAUTOR VARCHAR(20),
PRIMARY KEY (CLAVELIBRO,CLAVEAUTOR));

insert into ESCRITO_POR values(100,'A200');
insert into ESCRITO_POR values(101,'A200');
insert into ESCRITO_POR values(102,'A100');
insert into ESCRITO_POR values(103,'A300');
insert into ESCRITO_POR values(104,'A300');

ALTER TABLE ESCRITO_POR ADD FOREIGN KEY(CLAVELIBRO)REFEReNCES LIBRO(CLAVELIBRO);
ALTER TABLE ESCRITO_POR ADD FOREIGN KEY(CLAVEAUTOR)REFEReNCES AUTOR(CLAVEAUTOR);
