/* Creamos la tabla */
create table if not exists p2(
id integer auto_increment primary key,
cod integer not null
);

/* Le decimos por que valor queremos que se inicie la secuencia */
alter table p1 auto_increment = 1;

/* Modificamos la variable */
set @@auto_increment_increment = 5;

/* Insertamos datos */
insert into p2 values (null,100),(null,205),(null,102);