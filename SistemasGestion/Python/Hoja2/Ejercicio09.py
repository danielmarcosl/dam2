#_*_coding:utf-8_*_

'''Inicializar una variable con un valor aleatorio comprendido entre 1 y 50. 

Pedir al usuario un valor entero entre 1 y 50.

Mostrar el mensaje ACERTASTE si el numero introducido es igual al generado
y mostrar el mensaje ERROR si no lo es (en Python para ver si dos
variable almacenan el mismo valor se utiliza el operador relacional == ).

En caso de error se debe mostrar tambien el numero aleatorio generado.'''

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
