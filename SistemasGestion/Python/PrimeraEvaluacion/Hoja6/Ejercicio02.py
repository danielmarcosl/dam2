#_*_coding:utf-8_*_

# Pedimos al usuario que introduzca un string
cadena = raw_input("Introduce una cadena: ")
# Inizializamos un contador a 0
blancos = 0

# Recorremos el string, si hay un blanco, aumentamos el contador
for i in cadena :
	if i == " " :
		blancos += 1

# Mostramos el numero de blancos
print "Hay " + str(blancos) + " blancos"
