/*
Seleccionar las distintas companias de seguros que aseguran coches de la marca “SIAT” 
*/
SELECT Numero, Compania FROM seguros WHERE numero IN (SELECT seguro FROM coches WHERE marca = 'SIAT');