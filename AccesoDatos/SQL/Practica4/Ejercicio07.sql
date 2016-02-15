/*
Mostrar el inventario (precio * existencia) para cada producto. USAREMOS ALIAS
*/
SELECT Descripcion, Precio, Existencias, precio * existencias as 'Inventario' FROM productos;