CREATE OR REPLACE PROCEDURE cambiar_dni(
	viejo persona.dni%type,
	nuevo persona.dni%type)
IS
	
BEGIN
	UPDATE persona
	SET dni = nuevo
	WHERE dni = viejo;
END cambiar_dni;
/

SET SERVEROUTPUT ON;
BEGIN
	cambiar_dni('123456789A','111111111C');
END;
/
