#_*_coding:utf-8_*_

import random

# Generamos un entero aleatorio entre 1 y 50 y lo almacenamos en una variable tipo int
num = int(random.randint(1,50))

# Pedimos al usuario que introduzca un valor entre 1 y 50 y lo almacenamos en una variable tipo int
numintroducido = int(raw_input("Introduce un valor entre 1 y 50: "))

# Comprobamos y mostramos resultados
if num == numintroducido :
	print "Acertaste!"
else :
	print "Error, has introducido el numero " + str(numintroducido) + " y el generado es " + str(num)
