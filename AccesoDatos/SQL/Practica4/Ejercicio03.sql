/*
Mostrar las ventas de cada oficina ordenada en orden
alfabético por región y dentro de cada región, por ciudad
*/
SELECT Ventas, Region, Ciudad FROM oficinas ORDER BY region asc, ciudad asc;