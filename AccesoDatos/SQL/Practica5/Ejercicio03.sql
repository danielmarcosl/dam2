/*
Mostrar la fecha y la compania del seguro en el siguiente formato dd?mm?aaaa,
pero solo de los seguros que la compania contenga 2 'a'
*/
SELECT DATE_FORMAT(Fecha, '%d?%m?%Y') AS 'Fecha', Compania FROM seguros WHERE UPPER(compania) LIKE '%A%A%';