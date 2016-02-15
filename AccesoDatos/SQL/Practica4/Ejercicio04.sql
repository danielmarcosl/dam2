/*
Listar las oficinas clasificadas en orden descendente de ventas,
de modo que las oficinas con mayores ventas aparezcan en primer lugar
*/
SELECT Oficina, Ciudad, Region, Ventas FROM oficinas ORDER BY ventas DESC;