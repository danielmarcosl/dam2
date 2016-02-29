/*
Se nos indica que debemos crear una nueva tabla dentro
de la base de datos Colegio.sql. Dicha tabla se llama
Aparatos y a informacion que contiene es

COD_ELEM	NOMBRE		HORA
4			Disquete	15
5			Boligrafo	25
6			CD			12

Daros cuenta que los atributos son identicos a los de
la tabla elementos. Por lo tanto no nos interesa tener
dos tablas donde guardemos duplicada la informacion.
Indica entonces como lo harias
*/

CREATE TABLE IF NOT EXISTS aparatos(
cod_elemn INT(2) PRIMARY KEY,
nombre VARCHAR(20),
hora INT(3)
);

INSERT INTO aparatos VALUES
(4,'Disquete',15),
(5,'Boligrafo',25),
(6,'CD',12);

/* Anadir los datos de una de las dos tablas
a la otra, y eliminar la otra*/

INSERT INTO instrumentos SELECT * FROM aparatos;
