create table if not exists p1 (
cod int(2) primary key auto_increment,
nombre varchar(10) not null
);

/* Le decimos por que valor queremos que se inicie la secuencia */
alter table p1 auto_increment = 1001;

/* Se insertan valores */
insert into p1 values (null,'hola'),(null,'adios');

/* Vemos si se ha introducido correctamente */
select * from p1;