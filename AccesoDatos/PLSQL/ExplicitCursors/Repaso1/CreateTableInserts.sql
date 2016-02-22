CREATE TABLE alumno(
id_al INT(4) AUTOINCREMENT PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE asignatura(
id_asig INT(4) AUTOINCREMENT PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE profesor(
id_prof INT(4) AUTOINCREMENT PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE al_asig(
id_al INT(4) NOT NULL,
id_asig INT(4) NOT NULL,
nota INT(2) NOT NULL,
PRIMARY KEY (id_al, id_asig),
FOREIGN KEY (id_al) REFERENCES alumno(id_al),
FOREIGN KEY (id_asig) REFERENCES asignatura(id_asig)
);

INSERT INTO alumno VALUES (null,'');
INSERT INTO alumno VALUES (null,'');
INSERT INTO alumno VALUES (null,'');
INSERT INTO alumno VALUES (null,'');
INSERT INTO alumno VALUES (null,'');