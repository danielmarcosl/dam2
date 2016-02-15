/*
Mostrar el nombre de las personas y el nombre de su amigo
*/
SELECT p1.Nombre, p2.Nombre AS 'Amigo' FROM personas p1 JOIN personas p2 ON p1.amigo = p2.dni;