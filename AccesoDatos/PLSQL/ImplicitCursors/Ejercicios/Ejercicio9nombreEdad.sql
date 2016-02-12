CREATE OR REPLACE PROCEDURE mostrar_nombre_edad(
	d persona2.dni%type)
IS
	nom persona2.nombre%type;
	eda persona2.edad%type;
BEGIN
	SELECT nombre, edad
	INTO nom, eda
	FROM persona2
	WHERE dni = d;
	DBMS_OUTPUT.PUT_LINE('Nombre: '|| nom ||', edad: '|| eda);
END mostrar_nombre_edad;
/

SET SERVEROUTPUT ON;
BEGIN
	mostrar_nombre_edad('11');
END;
/
