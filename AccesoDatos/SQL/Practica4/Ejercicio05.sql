/*
Listar las oficinas clasificadas en orden descendente de rendimiento de ventas
(ventas-objetivos), de modo que las oficinas con mayor rendimiento aparezcan primero
*/
SELECT Oficina, Ciudad, Region, Ventas, Objetivo FROM oficinas ORDER BY (ventas/objetivo) DESC;