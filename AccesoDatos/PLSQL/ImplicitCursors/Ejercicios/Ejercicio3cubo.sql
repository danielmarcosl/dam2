CREATE OR REPLACE FUNCTION realizar_cubo(
	num NUMBER)
RETURN
	NUMBER
IS
	cubo NUMBER;
BEGIN
	cubo := ((num * num) * num);
	RETURN cubo;
END realizar_cubo;
/

SET SERVEROUTPUT ON;
DECLARE
	valor NUMBER(4);
BEGIN
	valor := realizar_cubo(5);
	DBMS_OUTPUT.PUT_LINE('Cubo: '|| valor);
END;
/
