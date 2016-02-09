create table if not exists emple2 (
dni varchar(10),
nombre varchar(30),
edad smallint(2),
sueldo smallint(4),
sexo char(1),
constraint ck_emple2_nombre check (nombre like '__E%' or like '__e%'),
constraint ck_emple2_edad check (edad in (12,15,18,20)),
constraint ck_emple2_sueldo check (sueldo between 1500 and 1505),
constraint ck_emple2_sexo check (sexo in ('H','M')));