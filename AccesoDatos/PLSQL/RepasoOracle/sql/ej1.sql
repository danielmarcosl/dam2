CREATE OR REPLACE PROCEDURE ej1(
c1 OUT sys_refcursor)
IS
BEGIN
	OPEN c1 FOR
		SELECT First_Name
		FROM employees
		WHERE salary > 35000;
END ej1;
/
