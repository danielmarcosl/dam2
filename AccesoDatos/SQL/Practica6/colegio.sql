CREATE TABLE IF NOT EXISTS proyectos (
cod_pro INT(3) PRIMARY KEY AUTO_INCREMENT,
descripcion VARCHAR(20) NOT NULL,
modulo VARCHAR(10) NOT NULL,
profesor VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS elementos (
cod_elem INT(3) PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
hora INT(3) NOT NULL,
CONSTRAINT CK_elementos_hora CHECK (hora > 0)
);

CREATE TABLE IF NOT EXISTS alumnos (
cod_al INT(3) PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
ciclo VARCHAR(10),
turno VARCHAR(6)
);

CREATE TABLE IF NOT EXISTS trabajos (
cod_al INT(3),
cod_elem INT(3),
cod_pro INT(3),
fecha DATE,
tiempo INT(4),
PRIMARY KEY (cod_al, cod_elem, cod_pro),
CONSTRAINT FK_trabajos_cod_al FOREIGN KEY (cod_al) REFERENCES alumnos(cod_al) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_trabajos_cod_elem FOREIGN KEY (cod_elem) REFERENCES elementos(cod_elem) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_trabajos_cod_pro FOREIGN KEY (cod_pro) REFERENCES proyectos(cod_pro) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO proyectos VALUES
(null,'Practica SGBD','SGBD','Felipe Garcia'),
(null,'Actividad Practica','FOL','Pedro Martinez'),
(null,'Practica Linux','SIMM','Rosa Alvarez'),
(null,'Practica Tienda','FP','Fermin Blanco');

INSERT INTO elementos VALUES
(null,'Ordenador',6),
(null,'Memoria',5),
(null,'Proyector',10);

INSERT INTO alumnos VALUES
(null,'Jose Sanchez','ASI','Manana'),
(null,'Manuel Diaz','DAI','Manana'),
(null,'Juan Perez','ASI','Tarde'),
(null,'Luis Ortiz','DAI','Tarde'),
(null,'Javier Martin','DAI','Manana');

INSERT INTO trabajos VALUES
(2,3,1,'2004-09-10',100),
(3,1,2,'2004-09-10',200),
(5,3,2,'2004-09-10',150),
(4,3,2,'2004-09-10',90),
(1,2,2,'2004-09-12',120),
(2,3,3,'2004-09-13',30),
(3,1,4,'2004-09-15',300),
(2,3,2,'2004-09-15',45);