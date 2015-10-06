#_*_coding:utf-8_*_

# Crear diccionario pidiendo por teclado 3 claves con sus 3 valores
clave1 = raw_input("Introduce una primera clave: ")
valor1 = raw_input("Introduce un valor para la primera clave: ")
clave2 = raw_input("Introduce una segunda clave: ")
valor2 = raw_input("Introduce un valor para la segunda clave: ")
clave3 = raw_input("Introduce una tercera clave: ")
valor3 = raw_input("Introduce un valor para la tercera clave: ")

claves = dict({clave1:valor1,clave2:valor2,clave3:valor3})

# Hacer un menu
opcion = int(raw_input("""Elige una opcion
1) Modificar clave
2) Borrar clave
Tu opcion: """))

# En opcion 1 se lepide que intrdouzca una clave, si existe, se le mostrara el valor, sino
if opcion == 1 :
	op1 = int(raw_input("Introduce una clave para ver si existe: "))
	if op1 == claves[0] or op1 == claves[1] or op1 == claves[2]:
		modificar = raw_input("¿Deseas modificar el valor? S/N: ")
		if modificar == "S" :
			claves[op1] = raw_input("Introduce el nuevo valor: ")
elif opcion == 2 :
	print "hola"
# En opcion 2, se le pide una nueva clave, si existe, se le puede borrar, sino se borrará esa clave y su valor
print claves
