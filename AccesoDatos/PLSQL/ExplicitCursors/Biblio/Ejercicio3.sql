CREATE OR REPLACE PROCEDURE mostrar_socio_antiguo
IS
	nom socio.nombre%TYPE;
	CURSOR c1
	IS
		SELECT nombre
		FROM socio
		WHERE clavesocio = (
			SELECT clavesocio
			FROM prestamo
			GROUP BY clavesocio
			HAVING COUNT(clavesocio) > 1)
		AND fecha_nac = (
			SELECT MIN(fecha_nac)
			FROM socio);
BEGIN
	OPEN c1;
		LOOP
			FETCH c1
			INTO nom;
			EXIT WHEN c1%notfound;
			DBMS_OUTPUT.PUT_LINE('Nombre :'|| nom);
		END LOOP;
	CLOSE c1;
END mostrar_socio_antiguo;
/

SET SERVEROUTPUT ON;
BEGIN
	mostrar_socio_antiguo;
END;
/
