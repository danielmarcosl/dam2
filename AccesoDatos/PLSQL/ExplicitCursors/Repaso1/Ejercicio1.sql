CREATE OR REPLACE PROCEDURE pro_nombre_empleados
IS
	nom empleados.nombre%TYPE;
	CURSOR c1
	IS
		SELECT nombre
		FROM empleados
		WHERE sueldo > 35000
BEGIN
	OPEN c1;
		LOOP
			FETCH c1
			INTO nom;
			EXIT WHEN c1%notfound;
			DBMS_OUTPUT.PUT_LINE('Nombre: '|| nom);
		END LOOP;
	CLOSE c1;
END pro_nombre_empleados;
/
show errors;
