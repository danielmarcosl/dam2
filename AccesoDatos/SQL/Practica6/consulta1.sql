/*
Obtener el nombre de los elementos que ha usado el alumno
con codigo 3 pero solo de los elementos que el tiempo medio
de trabajo sea mayor de 100.
*/

SELECT Nombre
FROM elementos
WHERE cod_elem IN (
	SELECT cod_elem
	FROM trabajos
	WHERE cod_al = 3
	AND tiempo IN (
		SELECT tiempo
		FROM trabajos
		GROUP BY cod_elem
		HAVING AVG(tiempo) > 100));