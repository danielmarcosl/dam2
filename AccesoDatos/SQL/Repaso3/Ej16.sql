/*
Visualiza la asignatura con mas creditos, la media de
creditos, la suma de los creditos y la titulacion a la
que pertenecen, para titulaciones con mas de 1 asignatura
*/

SELECT MAX(creditos) as 'Creditos',
AVG(creditos) as 'Media Creditos',
SUM(creditos) as 'Suma Creditos', t.nombre
FROM asignatura a, titulacion t
WHERE a.idtitulacion = t.idtitulacion
GROUP BY t.nombre
HAVING COUNT(t.nombre) > 1;
