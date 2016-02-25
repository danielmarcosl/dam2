CREATE TABLE IF NOT EXISTS equipo(
cod_equipo INT(4) PRIMARY KEY,
nombre VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS jugador(
dni VARCHAR(10) PRIMARY KEY,
nombre VARCHAR(15),
cod_equipo INT(4),
CONSTRAINT FK_jugador_cod_equipo FOREIGN KEY (cod_equipo) REFERENCES equipo(cod_equipo)
);

INSERT INTO equipo VALUES
(1,'FC Santander'),
(2,'FC Murcia');

INSERT INTO jugador VALUES
('1234C','Hernan',2),
('5678A','Fabian',1),
('1186E','Constantino',1),
('6485H','Marcos',2);

DELIMITER &&
CREATE PROCEDURE pro_mostrar_jugadores(
	p_cod INT(4))
BEGIN
	DECLARE v_dni VARCHAR(10);
	DECLARE v_nombre VARCHAR(15);
	DECLARE n INT DEFAULT 0;
	DECLARE c_recorrer_futbolistas CURSOR FOR
		SELECT dni, nombre
		FROM jugador
		WHERE cod_equipo = p_cod;
	SELECT COUNT(*) FROM jugador WHERE cod_equipo = p_cod INTO n;
	OPEN c_recorrer_futbolistas;
		WHILE n > 0 DO
			FETCH c_recorrer_futbolistas
			INTO v_dni, v_nombre;
			SELECT CONCAT('DNI: ', v_dni, ', Nombre: ', v_nombre)
			AS 'Dni, Nombre';
			SET n = n - 1;
		END WHILE;
	CLOSE c_recorrer_futbolistas;
END; &&
DELIMITER ;
