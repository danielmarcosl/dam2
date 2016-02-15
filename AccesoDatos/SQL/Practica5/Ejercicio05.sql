/*
Seleccionar las distintas companias de seguros que aseguran coches
del modelo "Tecnic" y cuyas polizas fueron contratadas despues del ano 2000.
*/
SELECT Numero, Compania FROM seguros WHERE numero IN (SELECT seguro FROM coches WHERE modelo = 'tecnic') AND DATE_FORMAT(fecha, '%Y') > '2000';