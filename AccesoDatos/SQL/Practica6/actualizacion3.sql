/*
Modificar el tiempo de trabajo de los Alumnos a 150,
pero solo de los que tienen un cod_al=2 y usan ordenador 
*/

UPDATE trabajos
SET tiempo = 150
WHERE cod_al = 2;
