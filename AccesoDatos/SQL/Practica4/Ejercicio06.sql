/*
Listar las oficinas clasificadas en orden alfabético por región y
dentro de cada región en orden descendente de rendimiento de ventas.
*/
SELECT Oficina, Region, Ventas, Objetivo FROM oficinas ORDER BY region ASC, (ventas/objetivo) DESC;