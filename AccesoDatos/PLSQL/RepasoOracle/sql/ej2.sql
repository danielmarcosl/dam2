CREATE TABLE alumno(
id NUMBER(4) PRYMARY KEY,
nombre VARCHAR(20));

CREATE TABLE asignatura(
id NUMBER(4) PRYMARY KEY,
nombre VARCHAR(20));

CREATE TABLE al_asig(
idalu NUMBER(4),
idasig NUMBER(4),
nota NUMBER(2),
PRIMARY KEY(idalu, idasig),
CONSTRAINT fk_al_asig_idalu FOREIGN KEY (idalu) REFERENCES alumno(id),
CONSTRAINT fk_al_asig_idasig FOREIGN KEY (idasig) REFERENCES asignatura(id) 
);

INSERT INTO alumno VALUES(1,'Eir');
INSERT INTO alumno VALUES(2,'Reki');
INSERT INTO alumno VALUES(3,'Haruka');
INSERT INTO alumno VALUES(4,'Aya');

INSERT INTO asignatura VALUES(10,'Idol');
INSERT INTO asignatura VALUES(20,'Escritor');

INSERT INTO al_asig VALUES(1,10,8);
INSERT INTO al_asig VALUES(1,20,6);
INSERT INTO al_asig VALUES(2,10,4);
INSERT INTO al_asig VALUES(2,20,9);
INSERT INTO al_asig VALUES(3,10,10);
INSERT INTO al_asig VALUES(3,20,5);
INSERT INTO al_asig VALUES(4,10,9);
INSERT INTO al_asig VALUES(4,20,5);

CREATE OR REPLACE PROCEDURE ej2(
c1 OUT sys_refcursor,
p_asig_nom asignatura.nombre%TYPE,
p_asig_not al_asig.nota%TYPE)
IS
BEGIN
	OPEN c1 FOR
		SELECT Nombre
		FROM alumno
		WHERE id IN (
			SELECT idalu
			FROM al_asig
			WHERE idasig = (
				SELECT id
				FROM asignatura
				WHERE nombre = p_asig_nom)
			AND nota = p_asig_not);
END ej2;
/
