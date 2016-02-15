/*
Seleccionar, alfabeticamente, el nombre de todas las personas que viven
en ciudades cuyo nombre empieza por A (por ejemplo, Avila, Alava, etc.)
*/
SELECT Nombre, Apellidos, Ciudad FROM personas WHERE ciudad like 'A%' ORDER BY nombre ASC;