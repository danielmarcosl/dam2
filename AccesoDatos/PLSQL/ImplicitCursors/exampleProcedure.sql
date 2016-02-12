CREATE OR REPLACE PROCEDURE mostrar_nombre(
	d persona.dni%type)
IS
	nom persona.nombre%type;
BEGIN
	SELECT nombre
	INTO nom
	FROM persona
	WHERE dni = d;
	
	DBMS_OUTPUT.PUT_LINE('Nombre: '|| nom);
END mostrar_nombre;
/

SET SERVEROUTPUT ON;
BEGIN
	mostrar_nombre('111111111C');
END;
/
