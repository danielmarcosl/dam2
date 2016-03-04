CREATE TABLE pelicula(
idpelicula INT(2) PRIMARY KEY,
titulooriginal VARCHAR(20),
espanola CHAR(1),
resumen VARCHAR(30)
);

CREATE TABLE premio(
idpremio INT(2) PRIMARY KEY,
nombre VARCHAR(20),
idpelicula INT(2),
CONSTRAINT fk_premio_idpelicula FOREIGN KEY (idpelicula) REFERENCES pelicula(idpelicula) ON DELETE CASCADA ON UPDATE CASCADE
);

CREATE TABLE nominacion(
idnominacion INT(2) PRIMARY KEY,
numedic INT(2),
idpelicula INT(2),
CONSTRAINT fk_nominacion_idpelicula FOREIGN KEY (idpelicula) REFERENCES pelicula(idpelicula) ON DELETE CASCADE ON UPDATE CASCADE
);
