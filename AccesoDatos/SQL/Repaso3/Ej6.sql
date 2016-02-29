/*
DNI de los profesores que tambien son alumnos
*/

SELECT DNI
FROM profesor
WHERE dni IN (
	SELECT dni
	FROM alumno);
