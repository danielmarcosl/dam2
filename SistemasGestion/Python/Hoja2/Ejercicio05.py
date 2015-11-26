#_*_coding:utf-8_*_

'''Vamos a crear un pequeno menu

Calculo de areas - Elige una figura geometrica:

a) Triángulo
b) Círculo

Si elegimos a o A nos debe pedir la base y la altura
y devolvernos el area de ese triangulo

Si elegimos la b o B debe pedir el radio y calcular el area(recordad a=pi*r2)'''

import math

# Imprimimos el menú
print """Selecciona una figura:
a) Triangulo
b) Circulo
"""

# Pedimos que seleccione una y guardamos el valor introducido
figura = raw_input("Su opcion: ")

# Filtramos el resultado
if figura == "a" :
	# Si ha seleccionado el triángulo, le pedimos la base y la altura y los almacenamos en variables tipo float
	base = float(raw_input("Introduce la base del triangulo: "))
	altura = float(raw_input("Introduce la altura del triangulo: "))
	
	# Calculamos el área
	areatriangulo = base * altura
	
	# Imprimimos el resultado
	print "El area del triangulo es " + str(areatriangulo)
elif figura == "b" :
	# Si ha seleccionado el circulo, le pedimos el radio y lo almacenamos en una variable tipo float
	radio = float(raw_input("Introduce el radio del circulo: "))
	
	# Calculamos el area
	areacirculo = (radio ** 2) * math.pi
	
	#Imprimimos el resultado
	print "El area del circulo es " + str(areacirculo)
else :
	# Si ha introducido un valor distinto, mostrarmos un error
	print "Valor introducido incorrecto"
