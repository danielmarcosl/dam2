#_*_coding:utf-8_*_

'''Escribir un programa que pida una cantidad en Euros e informe de su equivalente
en Dolares, sabiendo que el cambio a dia de hoy es 1 Euro = 1,4715 Dolares

El programa nos dara un mensaje de error si la cantidad introducida es negativa.
'''

# Pide un valor y lo almacena en una variable tipo float
euros = float(raw_input("Introduce una cantidad de euros: "))

# Si el valor introducido es negativo, da un error, sino continua
if euros < 0 :
	print "Error, la cantidad introducida es negativa"
else :
	# Calcula la cantidad de dólares correspondientes
	dolares = euros * 1.4715
	# Lo imprime por pantalla
	print str(euros) + " euros son " + str(dolares) + " dolares"
