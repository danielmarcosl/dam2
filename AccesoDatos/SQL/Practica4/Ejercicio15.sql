/*
Presentar los nombres de las empresa clientes seguidos de la primera ocurrencia de la letra ‘a’ dentro de los mismos
*/
SELECT Empresa, LOCATE('A',empresa) AS 'Primera Ocurrencia' FROM clientes;