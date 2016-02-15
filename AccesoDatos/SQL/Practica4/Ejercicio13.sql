/*
Obtener el tamano medio de pedido por cada vendedor
*/
SELECT AVG(p.cant) AS 'Tamano medio', r.Nombre FROM pedidos p JOIN repventas r ON p.rep = r.numempl GROUP BY r.nombre;