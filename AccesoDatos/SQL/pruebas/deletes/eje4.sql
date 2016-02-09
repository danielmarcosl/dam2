create table if not exists eje4 (
DNI integer,
nomb varchar(20),
sueldo float(4)
);
/*
insert into eje4 values
(1,'pepe',2000),
(2,'ana',1500),
(3,'silvia',1350),
(4,'ramon',2769);

Borrar donde dni sea 1
delete from eje4 where dni = 1;
delete from eje4 where dni in (1);
delete from eje4 where dni like '1';

Borrar donde sueldo sea entre 1000 y 1400 
delete from eje4 where sueldo between 1000 and 2000;
delete from eje4 where sueldo >= 1000 and sueldo <= 1400;

Vamos a borrar cuyo nombre tenga 2 A's
delete from eje4 where nomb like '%a%a%';

Vamos a borrar el que tenga un sueldo entre 1768, 1769, 2770
delete from eje4 where sueldo in (1768, 1769, 288);

Borrar de eje4 la fila o filas donde el sueldo sea menor al sueldo del empleado llamado pepo

delete from eje4 where sueldo < (select sueldo from eje4 where nomb = 'pepo');

Cambiar el sueldo de dni=2 a 2000
update eje4 set {sueldo = 2000} where dni = 2;

Incrementar en 50 euros el sueldo de silvia
update eje4 set {sueldo += 50} where nombre like 'silvia';

Actualizar el sueldo de las personas cuyo nombre termine por a con el sueldo del usuario con dni 4 de la tabla eje5
update eje4 set sueldo = (select sueldo from eje5 where dni = 4) where nombre like '%a';

Vamos a actualizar el sueldo de la persona que tiene dos 'I' en su nombre, incrementando dicho sueldo un 10%
update eje4 set sueldo = sueldo*1.1 where nomb like '%i%i%';

Vamos a actualizar el nombre de la persona cuyo sueldo entre 1999 y 2000 para que aparezca su nombre en mayusculas
update eje4 set nomb = upper(nomb) where sueldo between 1999 and 2000;

Vamos a actualizar el sueldo de las personas cuyo nombre empieza por 'R', decrementandolo un 50%
update eje4 set sueldo = sueldo/2 where nomb like 'r%';

Vamos a actualizar en eje5 el sueldo del dni = 4 con el sueldo del dni que no esta comprendido entre el 1,3,4
update eje5 set sueldo = (select sueldo from eje4 where dni not in (1,3,4)) where dni = 4;*/