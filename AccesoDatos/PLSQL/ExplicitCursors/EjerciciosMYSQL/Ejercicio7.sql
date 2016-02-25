CREATE TABLE IF NOT EXISTS departamento2(
cod_dept INT(4) PRIMARY KEY,
nombre VARCHAR(15),
planta INT(2)
);

CREATE TABLE IF NOT EXISTS departamento_copia SELECT * FROM departamento2;

INSERT INTO departamento2 VALUES
(1,'Direccion',2),
(2,'RRHH',1),
(3,'Ventas',2),
(4,'Contabilidad',3);

DELIMITER //
CREATE TRIGGER tr_actualizar_departamento
BEFORE UPDATE ON departamento2 FOR EACH ROW
BEGIN
	INSERT INTO departamento_copia (cod_dept, nombre, planta)
	VALUES (OLD.cod_dept, OLD.nombre, OLD.planta);
END; //
DELIMITER ;
