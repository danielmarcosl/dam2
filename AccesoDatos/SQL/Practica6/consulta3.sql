/*
Mostrar el nombre de los alumnos que han hecho el
proyecto “Practica SGBD”, que hayan usado un “ordenador ”,
pero solo de los alumnos en los que el tiempo sea menor
que la media de los tiempos de trabajos.
*/

SELECT nombre
FROM alumnos
WHERE cod_al IN (
	SELECT cod_al
	FROM trabajos
	WHERE cod_pro IN (
		SELECT cod_pro
		FROM proyectos
		WHERE descripcion = 'Practica SGBD')
	AND cod_elem IN (
		SELECT cod_elem
		FROM elementos
		WHERE nombre = 'Ordenador')
	AND tiempo < (
		SELECT AVG(tiempo)
		FROM trabajos));