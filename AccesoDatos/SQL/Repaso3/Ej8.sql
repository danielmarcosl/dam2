/*
Coste medio de las asignaturas de cada titulacion,
para aquellas titulaciones en el que el coste total
de la matricula sea mayor o igual que 60 euros
*/

SELECT AVG(costebasico) as 'Coste medio', IDtitulacion
FROM asignatura
GROUP BY idtitulacion
HAVING AVG(costebasico) >= 60
AND idtitulacion IN (
	SELECT idtitulacion
	FROM titulacion);
