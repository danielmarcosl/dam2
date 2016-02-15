/*
Listar las oficinas clasificadas en orden alfabetico por region y
dentro de cada region en orden descendente de rendimiento de ventas.
*/
SELECT Oficina, Region, Ventas, Objetivo FROM oficinas ORDER BY region ASC, (ventas/objetivo) DESC;