#_*_coding:utf-8_*_

# Declaramos un string con un valor que sera la contrasena
secreta = "cacahuete"

# Pedimos al usuario que introduzca una contrasena
# Si es correcta, imprimimos que esta bien, sino no, damos 3 intentos
for i in range(3) :
	clave = raw_input("Introduce una clave: ")
	if clave == secreta :
		print("Bien")
		break
	else :
		print "Incorrecto"
		print "Intentos restantes " + str(i)
