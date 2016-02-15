/*
Mostrar el tipo de seguro y la marca, modelo de los coches que pertenecen a los seguros del 4 trimestre
*/
SELECT s.Tipo, c.Marca, c.Modelo FROM seguros s JOIN coches c ON s.numero = c.seguro WHERE DATE_FORMAT(s.fecha, '%m') IN (10,11,12);