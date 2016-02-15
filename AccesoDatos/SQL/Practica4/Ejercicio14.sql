/*
Obtener las ciudades donde se encuentran las oficinas con su
nombre inicial en mayuscula, en minúscula y el numero de caracteres
*/
SELECT LOWER(ciudad) AS 'Ciudades min', UPPER(ciudad) AS 'Ciudades may', LENGTH(ciudad) AS 'Caracteres' FROM oficinas;