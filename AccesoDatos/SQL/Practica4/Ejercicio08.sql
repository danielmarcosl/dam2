/*
Mostrar la nueva cuota consistente en elevar la cuota de cada 
vendedor un 3% de sus ventas Mostrar la antigua y la actualizada.
*/
SELECT Nombre, cuota AS 'Cuota antigua', cuota * 1.03 AS 'Cuota actualizada' FROM repventas;