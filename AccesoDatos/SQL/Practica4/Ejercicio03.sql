/*
Mostrar las ventas de cada oficina ordenada en orden
alfabetico por region y dentro de cada region, por ciudad
*/
SELECT Ventas, Region, Ciudad FROM oficinas ORDER BY region ASC, ciudad ASC;