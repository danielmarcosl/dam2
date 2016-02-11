CREATE OR REPLACE PROCEDURE max_y_min
IS
	maxi articulos.precio%type;
	mini articulos.precio%type;
BEGIN
	SELECT MIN(precio), MAX(precio)
	INTO mini, maxi
	FROM articulos;
	
	DBMS_OUTPUT.PUT_LINE('Minimo: '|| mini ||', Maximo: '|| maxi);
END max_y_min;
/

SET SERVEROUTPUT ON;
BEGIN
	max_y_min;
END;
/
