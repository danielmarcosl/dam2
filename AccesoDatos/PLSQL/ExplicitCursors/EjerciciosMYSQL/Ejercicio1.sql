CREATE TABLE IF NOT EXISTS alumnos(
dni VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(20),
asignatura VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS alumnosinf SELECT * FROM alumnos;

CREATE TABLE IF NOT EXISTS otros SELECT * FROM alumnos;

INSERT INTO alumnos VALUES
('12345a','Antonio','Informatica'),
('56456c','Hugo','Fisica'),
('46464E','Martin','Religion'),
('88115J','Susana','Informatica'),
('19844K','Timoteo','Informatica'),
('94894B','Gervasio','Quimica');

DELIMITER $$
CREATE PROCEDURE pro_copiar_alumnos()
BEGIN
	DECLARE	v_dni VARCHAR(10);
	DECLARE v_nombr VARCHAR(20);
	DECLARE v_asign VARCHAR(15);
	DECLARE n INT DEFAULT 0;
	DECLARE c_recorrer_alumnos CURSOR
	FOR
		SELECT dni, nombre, asignatura
		FROM alumnos;
	SELECT COUNT(*) FROM alumnos INTO n;
	OPEN c_recorrer_alumnos;
		WHILE n > 0 DO
			FETCH c_recorrer_alumnos
			INTO v_dni, v_nombr, v_asign;
			IF UPPER(v_asign) = 'INFORMATICA' THEN
				INSERT INTO alumnosinf
				VALUES (v_dni, v_nombr, v_asign);
			ELSE
				INSERT INTO otros
				VALUES (v_dni, v_nombr, v_asign);
			END IF;
			SET n = n - 1;
		END WHILE;
	CLOSE c_recorrer_alumnos;
END; $$
DELIMITER ;
