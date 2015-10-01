#_*_coding:utf-8_*_

# Creamos la lista
lista = [1,3,4,6,8,10]

# Mostramos el menu
print '''Selecciona una opcion del menu
1. Pintar toda la lista
2. Pinta de la lista 3 y 4 usando el formato de [::]
3. Indica la longitud
4. Pinta el 10 y el 8 usando negativos y [::]
5. Mirar valores posicion par o impar en posicion 0 y -1'''

# Pedimos al usuario que introduzca una opcion
opcion = int(raw_input("Tu opcion: "))

if opcion == 1 :
	# Pintar lista entera
	print lista
elif opcion == 2 :
	# Pintar posicion 3 y 4
	print lista[3:5:1]
elif opcion == 3 :
	# Pintar longitud
	print "La longitud es  " + str(len(lista))
elif opcion == 4 :
	# Pintar 10 y 8 usando negativos y [::]
	print lista[-1:-3:-1]
elif opcion == 5 :
	# Pintar par o impar en posicion 0 y -1
	# Dividimos el numero de la posicion 0 entre 2 para saber si es par o impar
	if lista[0] % 2 == 0 :
		print "El numero " + str(lista[0]) + ", de la posicion 0, es par"
	else :
		print "El numero " + str(lista[0]) + ", de la posicion 0, es impar"
	# Dividimos el numero de la posicion -1 entre 2 para saber si es par o impar
	if lista[-1] % 2 == 0 :
		print "El numero " + str(lista[-1]) + ", de la posicion -1, es par"
	else :
		print "El numero " + str(lista[-1]) + ", de la posicion -1, es impar"
else :
	# Pintar error si se ha introducido una opcion no valida
	print "Opcion no valida"
