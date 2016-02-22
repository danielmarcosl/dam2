CREATE TABLE alumno(
id_al NUMBER(4) PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE asignatura(
id_asig NUMBER(4) PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE profesor(
id_prof NUMBER(4) PRIMARY KEY,
nombre VARCHAR(20)
);

CREATE TABLE al_asig(
id_al NUMBER(4),
id_asig NUMBER(4),
nota NUMBER(2) NOT NULL,
PRIMARY KEY (id_al, id_asig),
FOREIGN KEY (id_al) REFERENCES alumno(id_al),
FOREIGN KEY (id_asig) REFERENCES asignatura(id_asig)
);

INSERT INTO alumno VALUES (1,'Margarito');
INSERT INTO alumno VALUES (2,'Pepeflutas');
INSERT INTO alumno VALUES (3,'Diletuqueasino');
INSERT INTO alumno VALUES (4,'Pofavordesconectemovil');
INSERT INTO alumno VALUES (5,'Tepidequemetas5');

