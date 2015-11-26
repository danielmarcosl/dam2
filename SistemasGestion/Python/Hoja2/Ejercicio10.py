#_*_coding:utf-8_*_

'''Realizar un programa que pida el valor del radio de una esfera muestre
por pantalla un menu y realice las siguientes opciones:

a) Calcular el diametro (radio * 2)

b) Calcular el perimetro (2 *pi*radio)

c) Calcular el area (2 *pi*radio al cuadrado)'''

import math

# Pedimos el radio y lo almacenamos en una variable tipo float
radio = float(raw_input("Introduce el radio: "))

# Mostramos el menú
print """Elige una de las siguientes opciones:
a) Calcula el diametro
b) Calcula el perimetro
c) Calcula el area
"""
# Pedimos que elija una opción y la almacenamos
opcion = raw_input("Tu opcion: ")

# Filtramos el valor introducido
if opcion == "a" :
	# Calculamos el diametro y lo mostramos
	diametro = radio * 2
	print "El diametro es " + str(diametro)
elif opcion == "b" :
	# Calculamos el perimetro y lo mostramos
	perimetro = 2 * math.pi * radio
	print "El perimetro es " + str(perimetro)
elif opcion == "c" :
	# Calculamos el area y lo mostramos
	area = 2 * math.pi * radio ** 2
	print "El area es " + str(area)
else :
	# Si ha introducido algo distinto, mostramos un error
	print "Valor introducido incorrecto"
