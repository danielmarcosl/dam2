CREATE TABLE IF NOT EXISTS empleados(
dni VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(10),
apellido VARCHAR(10),
fecha DATE);

INSERT INTO empleados VALUES
('45456D','Manuel','Galindo','1990-02-21'),
('41145E','Tochar','Facundo','1988-12-11'),
('40645C','Santiago','Pachon','1991-06-25'),
('38875A','Rebeca','Perez','1987-09-13');

DELIMITER ##
CREATE PROCEDURE pro_apellido_fecha()
BEGIN
	DECLARE v_apell VARCHAR(10);
	DECLARE v_fecha DATE;
	DECLARE n INT DEFAULT 0;
	DECLARE c_recorrer_empleados CURSOR
	FOR
		SELECT apellido, fecha
		FROM empleados
		ORDER BY apellido;
	SELECT COUNT(*) FROM empleados INTO n;
	OPEN c_recorrer_empleados;
		WHILE n > 0 DO
			FETCH c_recorrer_empleados
			INTO v_apell, v_fecha;
			SELECT concat('Apellido ', v_apell, ', Fecha ', v_fecha)
			AS 'Apellido, Fecha';
			SET n = n - 1;
		END WHILE;
	CLOSE c_recorrer_empleados;
END; ##
DELIMITER ;
