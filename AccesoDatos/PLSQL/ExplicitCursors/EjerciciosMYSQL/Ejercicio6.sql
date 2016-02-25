CREATE TABLE IF NOT EXISTS sueldo(
id_sueldo INT(2) PRIMARY KEY,
cantidad FLOAT(4,2)
);

CREATE TABLE IF NOT EXISTS sueldo_iva SELECT * FROM sueldo;

DELIMITER ##
CREATE TRIGGER tr_sueldo_iva
AFTER INSERT ON sueldo FOR EACH ROW
BEGIN
	DECLARE v_iva FLOAT(4,2);
	SET v_iva = NEW.cantidad * 1.21;
	INSERT INTO sueldo_iva (id_sueldo, cantidad)
	VALUES (NEW.id_sueldo, v_iva);
END; ##
DELIMITER ;
