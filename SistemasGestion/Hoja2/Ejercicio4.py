#_*_coding:utf-8_*_

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
