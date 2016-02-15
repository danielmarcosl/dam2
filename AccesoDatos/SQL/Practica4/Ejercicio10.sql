/*
Mostrar los pedidos que se han realizado entre 1 mayo y 31 de diciembre de 2004
*/
SELECT NumPedido, FechaPedido FROM pedidos WHERE fechapedido BETWEEN '2004-05-01' AND '2004-12-31';