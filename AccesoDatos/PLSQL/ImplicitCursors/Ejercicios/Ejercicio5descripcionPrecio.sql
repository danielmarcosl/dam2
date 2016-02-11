CREATE OR REPLACE PROCEDURE producto_descripcion_precio(
	num producto.numero%type)
IS
	des producto.descripcion%type;
	pre producto.precio%type;
BEGIN
	SELECT descripcion, precio
	INTO des, pre
	FROM producto
	WHERE numero = num;
	
	DBMS_OUTPUT.PUT_LINE('Descripcon: '|| des ||', precio'|| pre);
END producto_descripcion_precio;
/

SET SERVEROUTPUT ON;
BEGIN
	producto_descripcion_precio(7900);
END;
/
