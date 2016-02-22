/*
Mostrar las horas mas bajas que tienen los elementos,
pero solo de los elementos que en su nombre contenga
una E y que su trabajo se haya realizado entre
“2004-09-10” y “2004-09-16”
*/

SELECT Hora, Nombre
FROM elementos
WHERE UPPER(nombre) like '%E%'
AND cod_elem IN (
	SELECT cod_elem
	FROM trabajos
	WHERE fecha BETWEEN '2004-09-10' AND '2004-09-16')
ORDER BY hora ASC;
