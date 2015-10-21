#_*_coding:utf-8_*_

# Pedimos al usuario que introduzca un string
cadena = raw_input("Introduce una cadena: ")
# Guardamos la cadena al reves en otro string
cadena2 = cadena[::-1]

# Comparamos ambas cadenas	
if cadena == cadena2 :
	print "Son palindromos"
	
else :
	print "No son palindromos"
