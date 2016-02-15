/*
Queremos saber los vendedores que trabajan en las oficinas de representacion 12, 13, 22
*/
SELECT Nombre, OficinaRep FROM repventas WHERE oficinarep in (12,13,22);