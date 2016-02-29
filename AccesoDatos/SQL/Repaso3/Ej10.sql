/*
Id de los alumnos matriculados en la asignatura
"150212" pero no en la "130113". (2 subconsultas)
*/

SELECT IDalumno
FROM alumno
WHERE idalumno IN (
	SELECT idalumno
	FROM alumno_asignatura
	WHERE idasignatura IN (
		SELECT idasignatura
		FROM alumno_asignatura
		WHERE idasignatura NOT IN ('130113'))
	AND idasignatura IN ('150212'));
