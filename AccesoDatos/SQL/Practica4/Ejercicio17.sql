/*
Mostrar la fecha de contrato de los vendedores pero a esa fecha previamente le anadiremos medio ano.
*/
SELECT Contrato, DATE_ADD(contrato, INTERVAL 6 MONTH) AS 'Nuevo Contrato' FROM repventas;