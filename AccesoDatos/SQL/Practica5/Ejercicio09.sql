/*
Mostrar las ciudades cuya cantidad sea mayor que 1 en la tabla personas
*/
SELECT Ciudad, COUNT(ciudad) AS 'Cantidad' FROM personas GROUP BY Ciudad HAVING COUNT(ciudad) > 1;