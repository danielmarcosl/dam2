/*
Mostrar el inventario (precio * existencia) para cada producto. USAREMOS ALIAS
*/
SELECT Descripcion, Precio, Existencias, precio * existencias AS 'Inventario' FROM productos;