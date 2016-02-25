CREATE TABLE IF NOT EXISTS empleado3(
dni VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(15),
comision INT(3)
);

CREATE TABLE IF NOT EXISTS copia_emple SELECT * FROM empleado3;

INSERT INTO empleado3 VALUES
('123','Juan',15),
('561','Pedro',0),
('612','Raul',23),
('717','Sonia',0);

DELIMITER &&
CREATE TRIGGER tr_borrar_empleado
AFTER DELETE ON empleado3 FOR EACH ROW
BEGIN
	IF OLD.comision = 0 THEN
		INSERT INTO copia_emple (dni, nombre, comision)
		VALUES (OLD.dni, OLD.nombre, OLD.comision);
	END IF;
END; &&
DELIMITER ;
