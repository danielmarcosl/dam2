/*
Listar los vendedores cuyas ventas no están entre el 80 y el 120% de su cuota
*/
SELECT Nombre FROM repventas WHERE ventas BETWEEN (cuota * 0.8) AND (cuota * 1.2);