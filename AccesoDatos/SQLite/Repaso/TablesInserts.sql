CREATE TABLE cliente(
codigo_cliente INT(4) PRIMARY KEY,
edad INT(2),
direccion VARCHAR(30)
);

CREATE TABLE pedido(
codigo_pedido INT(4) PRIMARY KEY,
descripcion VARCHAR(20),
fecha_pedido DATE,
email_contacto VARCHAR(20),
telefono_cliente INT(9),
codigo_cliente INT(4),
CONSTRAINT FK_pedido_codigo_cliente FOREIGN KEY (codigo_cliente)
REFERENCES cliente(codigo_cliente) 
);

INSERT INTO cliente VALUES(1,25,'Calle de la piruleta');
INSERT INTO cliente VALUES(2,24,'Calle del bollo de chocolate');
INSERT INTO cliente VALUES(3,26,'Calle del bizcocho');
INSERT INTO cliente VALUES(4,22,'Calle de la torrija');

INSERT INTO pedido VALUES
(1,'Tornillos','2014-10-15','piruleto@gmail.com',123456789,1);
INSERT INTO pedido  VALUES
(2,'Bombillas','2014-10-17','bollito@hotmail.es',789654258,1);
INSERT INTO pedido VALUES 
(3,'Papeles','2014-10-21','bizcochito@yahoo.es',956745892,4);
INSERT INTO pedido VALUES
(4,'Senoras','2014-10-22','piruleto@gmail.com',963569874,2);
INSERT INTO pedido VALUES
(5,'IOExceptions','2014-11-02','teletorrija@gmail.com',125789658,3);
INSERT INTO pedido VALUES
(6,'Cazamariposas','2014-11-12','claves@java.com',915364785,3);
