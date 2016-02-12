CREATE OR REPLACE FUNCTION insertar_empleado(
	cod empleado.codigo%type,
	nom empleado.nombre%type,
	ape empleado.apellido%type)
RETURN
	NUMBER
IS
	resultado NUMBER(1);
BEGIN
	resultado := buscar_codigo_empleado(cod);
	IF resultado = 0 THEN
		INSERT INTO empleado VALUES(cod,nom,ape);
	END IF;
	RETURN resultado;
END insertar_empleado;
/

SET SERVEROUTPUT ON;
DECLARE
	resul NUMBER(1);
BEGIN
	resul := insertar_empleado(1122,'Mariano','Huston');
	DBMS_OUTPUT.PUT_LINE('Resultado: '|| resul);
END;
/
