#_*_coding:utf-8_*_

'''Generar un numero aleatorio entre 1 y 20. Luego
informar si el numero tiene uno o dos digitos'''

import random

# Generamos un número aleatorio y lo almacenamos en una variable tipo int
num = int(random.randint(1,20))

# Comprobamos si tiene uno o dos dígitos, y mostramos el resultado
if num >= 10 :
	print "Tiene dos digitos"
elif num < 10 :
	print "Tiene un digito"
