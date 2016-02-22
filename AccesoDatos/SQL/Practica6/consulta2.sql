/*
Obtener los distintos modulos de los proyectos donde
hayan trabajado los alumnos cuyo nombre empiece por J.
*/

SELECT Modulo
FROM proyectos
WHERE cod_pro IN (
	SELECT cod_pro
	FROM trabajos
	WHERE cod_al IN (
		SELECT cod_al
		FROM alumnos
		WHERE nombre like 'J%'));