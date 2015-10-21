#_*_coding:utf-8_*_

# Pedimos al usuario que introduzca un string
cadena = raw_input("Introduce una cadena: ")
# Pedimos al usuario que introduzca un caracter
caracter = raw_input("Introduce un caracter: ")
# Variable donde contaremos el numero de veces que esta el caracter en el string
contador = 0

print cadena

for i in cadena :
	if i == caracter :
		contador += 1
		
print "El caracter " + caracter + " esta repetido " + str(contador)
