#_*_coding:utf-8_*_

'''Un almacen realiza un descuento del 40% si se compran mas de
100 unidades de un mismo articulo; un 20% si se compran entre 25
y 100 unidades y un 10% si se compran entre 10 y 24 unidades.

Escribir un programa que pregunte el precio de un articulo y la cantidad
comprada informe del total a pagar asi como del descuento aplicado.'''

# Pedimos el precio y lo almacenamos en una variable tipo float
precio = float(raw_input("Introduce el precio: "))
# Pedimos la cantidad y la almacenamos en una variable tipo int
cantidad = int(raw_input("Introduce la cantidad: "))

# Filtramos los resultados por el valor de cantidad
if cantidad >= 100 :
	# Cantidad superior a 100, descuento de 40%
	# Calculamos el precio y lo mostramos
	preciototal = (precio * cantidad) * 0.6
	
	print "El precio total es " + str(preciototal)
elif cantidad >= 25 and cantidad < 100 :
	# Cantidad entre 25 y 99, descuento de 20%
	# Calculamos el precio y lo mostramos
	preciototal = (precio * cantidad) * 0.8
	
	print "El precio total es " + str(preciototal)
elif cantidad >= 10 and cantidad < 25 :
	# Cantidad entre 10 y 24, descuento de 10%
	# Calculamos el precio y lo mostramos
	preciototal = (precio * cantidad) * 0.9
	
	print "El precio total es " + str(preciototal)
elif cantidad < 10 and cantidad > 0:
	# Cantidad inferior a 10, sin descuento
	# Calculamos el precio y lo mostramos
	preciototal = precio * cantidad
	
	print "El precio total es " + str(preciototal)
	
