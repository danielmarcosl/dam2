/*
Mostrar la compania y la suma de las franquicias, pero solo de las que tengan una suma superior a 100
*/
SELECT Compania, SUM(franquicia) AS 'Suma Franquicias' FROM seguros GROUP BY compania HAVING SUM(franquicia) > 100;