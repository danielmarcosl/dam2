CREATE TABLE asignatura(
asignatura_id NUMBER(2) PRIMARY KEY,
nombrea VARCHAR(20)
);

CREATE TABLE profesor(
id NUMBER(2) PRIMARY KEY,
nombrep VARCHAR(20),
asignatura_id NUMBER(2),
CONSTRAINT fk_emp FOREIGN KEY(asignatura_id) REFERENCES asignatura(asignatura_id)
);

INSERT INTO asignatura VALUES(1,'Bases');
INSERT INTO asignatura VALUES(2,'Sistemas');
INSERT INTO asignatura VALUES(3,'Moviles');
INSERT INTO asignatura VALUES(4,'Plastilina');
INSERT INTO asignatura VALUES(5,'Vicios Crudos');

CREATE OR REPLACE PROCEDURE insertp(
p_asig asignatura.nombrea%TYPE,
p_prof_id profesor.id%TYPE,
p_prof_nom profesor.nombrep%TYPE)
IS
v_any_row_found NUMBER;
v_asig_id asignatura.asignatura_id%TYPE;
BEGIN
	SELECT COUNT(*)
	INTO v_any_row_found
	FROM asignatura
	WHERE nombrea = p_asig;
	
	IF v_any_row_found >= 1 THEN
		SELECT asignatura_id
		INTO v_asig_id
		FROM asignatura
		WHERE nombrea = p_asig;
		
		INSERT INTO profesor VALUES
		(p_prof_id, p_prof_nom, v_asig_id);
	END IF;
END insertp;
/
