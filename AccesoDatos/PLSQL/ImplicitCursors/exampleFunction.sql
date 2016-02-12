CREATE OR REPLACE FUNCTION mostrar_dni(
	n persona.nombre%type)
RETURN
	persona.dni%type
IS
	dn persona.dni%type;
BEGIN
	SELECT dni
	INTO dn
	FROM persona
	WHERE nombre = n;
	
	RETURN dn;
END mostrar_dni;
/

SET SERVEROUTPUT ON;
DECLARE
	dni persona.dni%type;
BEGIN
	dni := mostrar_dni('Miguel');
	DBMS_OUTPUT.PUT_LINE('DNI: '|| dni);
END;
/
