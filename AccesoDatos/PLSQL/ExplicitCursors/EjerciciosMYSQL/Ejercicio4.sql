CREATE TABLE IF NOT EXISTS departamento(
cod_dept INT(4) PRIMARY KEY,
nombre VARCHAR(15),
planta INT(2)
);

CREATE TABLE IF NOT EXISTS empleado2(
dni VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(15),
edad INT(2),
sexo CHAR(1),
cod_dept INT(4) ,
CONSTRAINT FK_empleado2_cod_dept FOREIGN KEY (cod_dept) REFERENCES departamento(cod_dept)
);

INSERT INTO departamento VALUES
(1,'Ventas',NULL),
(2,'Marketing',NULL),
(3,'RRHH',NULL),
(4,'Direccion',NULL);

INSERT INTO empleado2 VALUES
('10','Juan',30,'H',NULL),
('20','Pedro',40,'H',3),
('30','Raul',50,'H',2),
('40','Sonia',20,'M',NULL);

DELIMITER %%
CREATE PROCEDURE pro_actualizar_departamento()
BEGIN
	DECLARE v_dni VARCHAR(10);
	DECLARE v_sexo CHAR(1);
	DECLARE n INT DEFAULT 0;
	DECLARE c_recorrer_empleados CURSOR FOR
		SELECT dni, sexo
		FROM empleado2
		WHERE cod_dept IS NULL;
	SELECT COUNT(*) FROM empleado2 WHERE cod_dept IS NULL INTO n;
	OPEN c_recorrer_empleados;
		WHILE n > 0 DO
			FETCH c_recorrer_empleados
			INTO v_dni, v_sexo;
			IF v_sexo = 'M' THEN
				UPDATE empleado2
				SET cod_dept = 4
				WHERE dni = v_dni;
			ELSEIF v_sexo = 'H' THEN
				UPDATE empleado2
				SET cod_dept = 3
				WHERE dni = v_dni;
			END IF;
			SET n = n - 1;
		END WHILE;
	CLOSE c_recorrer_empleados;
END; %%
DELIMITER ;
