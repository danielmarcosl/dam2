/*
Calcula el numero de cuotas y su media, y el numero de cuotas distintas
*/
SELECT COUNT(cuota) AS 'Num Cuotas', AVG(cuota) AS 'Media Cuotas', COUNT(DISTINCT(cuota)) AS 'Num Distintas' FROM repventas;