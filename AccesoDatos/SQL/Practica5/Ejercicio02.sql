/*
Obtener el nombre del mes del seguro del ano 2003
*/
SELECT DATE_FORMAT(fecha, '%M') AS 'Nombre Mes' FROM seguros WHERE DATE_FORMAT(fecha, '%Y') = '2003';