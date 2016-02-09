create table if not exists alumnos (
nombre varchar(20),
apellido1 varchar(20),
apellido2 varchar(20),
dni_alumno varchar(10) primary key,
direccion varchar(30),
sexo char(1),
fecha_nacimiento date,
constraint ck_alumnos_sexo check (sexo in('M','H')));

create table if not exists cursos (
nombre_curso varchar(20) unique,
cod_curso smallint(3) primary key,
dni_alumno varchar(10) not null,
maximo_alumno smallint(2),
fecha_inicio date,
fecha_fin date,
num_horas smallint(3) not null,
constraint ck_cursos_fechas check (fecha_inicio < fecha_fin),
constraint fk_cursos_dni_alumno foreign key (dni_alumno) references alumnos(dni_alumno));

create table if not exists profesores ( 
nombre_profesor varchar(20) unique,
apellido_profesor varchar(20),
cod_curso varchar(10) not null,
dni varchar(10) primary key,
direccion_profesor varchar(30),
titulo varchar(10) not null,
sueldo smallint(4) not null,
constraint ck_profesores_sueldo check (sueldo >= 0),
constraint ck_profesores_titulo check (titulo in('GRADO','INGENIERO')),
constraint fk_profesores_cod_curso foreign key (cod_curso) references cursos(cod_curso));
