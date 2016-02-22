/*
Nombre de los elementos que tienen una hora mayor que
la hora de las “memorias” (REALIZAR CON SUBCONULTA)
*/

SELECT Nombre
FROM elementos
WHERE hora > (
	SELECT hora
	FROM elementos
	WHERE nombre = 'Memoria');