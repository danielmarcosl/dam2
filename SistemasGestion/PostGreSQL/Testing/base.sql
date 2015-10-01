create table Alumno(
DNI varchar(10) primary key,
Nombre varchar(20) not null,
Edad numeric(3) not null,
Sexo char(1) not null,
constraint check1 check(sexo in ('M','H')));

insert into Alumno values
('123456789A','Daniel','22','H');
insert into Alumno values
('187856789A','Computadora','24','H');
insert into Alumno values
('123454569A','Ilitir','288','H');

\d Alumno
select * from Alumno;
\l
\c template1