CREATE TABLE IF NOT EXISTS Personas (
dni INT(10) PRIMARY KEY,
nombre VARCHAR(10),
apellidos VARCHAR(10),
direccion VARCHAR(30),
ciudad VARCHAR(15),
pais VARCHAR(15),
amigo INT(10)
);

CREATE TABLE IF NOT EXISTS Seguros (
numero INT(4) PRIMARY KEY,
compania VARCHAR(20),
tipo VARCHAR(20),
franquicia FLOAT(6),
tomador INT(10),
fecha DATE,
CONSTRAINT FK_seguros_tomador FOREIGN KEY (tomador) REFERENCES personas(dni)
);

CREATE TABLE IF NOT EXISTS Coches (
matricula VARCHAR(12) PRIMARY KEY,
marca VARCHAR(10),
modelo VARCHAR(10),
color VARCHAR(10),
conductor INT(10),
seguro INT(4),
CONSTRAINT FK_coches_conductor FOREIGN KEY (conductor) REFERENCES personas(dni),
CONSTRAINT FK_coches_seguro FOREIGN KEY (seguro) REFERENCES seguros(numero)
);

INSERT INTO Personas VALUES
(1, 'Pepe', 'Sanchez', 'C/calleja, 5', 'Madrid', 'España',2),
(2, 'Juan', 'Martin', 'C/otra, 2', 'Madrid', 'España',3),
(3, 'Antonio', 'Fernandez', 'C/barco, 3', 'Toledo', 'España',1),
(4, 'Ines', 'Perez', 'C/asa, 15', 'Burgos', 'España',6),
(5, 'Rosa', 'Rosado', 'C/pedro I, 3', 'Avila', 'España',5),
(6, 'John', 'Smith', 'C/Down street, 2', 'London', 'UK',4);

ALTER TABLE Personas ADD CONSTRAINT FK_personas_amigo FOREIGN KEY (amigo) REFERENCES personas(dni);

INSERT INTO Seguros VALUES
(1, 'AS S.A.', 'Terceros', 120.00, 1,'2000-01-01'),
(2, 'patria', 'Todo Riesgo', 0.00, 3,'2002-01-01'),
(3, 'sin problemas', 'Todo Riesgo', 180.00, 2,'2000-12-01'),
(4, 'AS S.A.', 'Terceros', 60.00, 4,'2001-11-01'),
(5, 'el descanso', 'Terceros', 200.00, 5,'2003-12-01');

INSERT INTO Coches VALUES
('1111 CCC', 'SIAT', 'coupe', 'rojo', 1, 1),
('2222 CCC', 'FORDE', 'atlas', 'azul', 2, 3),
('3333 BCC', 'WMB', 'espac', 'verde', 3, 2),
('1234 CDC', 'SIAT', 'tecnic', 'azul', 4, 4),
('1213 CBB', 'GM', 'higg', 'plata', 1, 5);
