CREATE OR REPLACE PROCEDURE sumar_numeros (
	num1 NUMBER,
	num2 NUMBER)
IS
	suma NUMBER;
BEGIN
	suma := num1 + num2;
	DBMS_OUTPUT.PUT_LINE('Suma: '|| suma);
END sumar_numeros;
/

SET SERVEROUTPUT ON;
BEGIN
	sumar_numeros(4,5);
END;
/
