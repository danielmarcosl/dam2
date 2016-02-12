CREATE OR REPLACE FUNCTION buscar_codigo_empleado(
	cod empleado.codigo%type)
RETURN
	NUMBER
IS
	c empleado.codigo%type;
BEGIN
	SELECT codigo
	INTO c 
	FROM empleado WHERE codigo = cod;
	IF (c LIKE cod) THEN
		RETURN 1;
	END IF;
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		RETURN 0;
END buscar_codigo_empleado;
/


SET SERVEROUTPUT ON;
DECLARE
	codigo empleado.codigo%type;
BEGIN
	codigo := buscar_codigo_empleado(11);
	dbms_output.put_line('El valor es'||','|| codigo);
END;
/
