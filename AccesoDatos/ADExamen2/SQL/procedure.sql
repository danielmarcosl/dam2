CREATE OR REPLACE PROCEDURE oracle(
	c1 out sys_refcursor)
IS
BEGIN
	OPEN c1 FOR
		SELECT dni, nombre, apellido, fechanac, sexo, sueldo
		FROM empleado
		WHERE dni IN (
			SELECT dni
			FROM tecnico)
		AND dni IN (
			SELECT dni
			FROM trabajan
			GROUP BY dni
			HAVING COUNT(cod_proy) >= 2);
END oracle;
/