#_*_coding:utf-8_*_

dicl = {"Esp":"espanyol","Ing":"Ingles","Fra":"Frances","Ita":"Italiano","Rus":"Ruso"}

# Listar las claves del diccionario
print dicl.keys()

# Buscar una clave pedida por teclada, de tres maneras
clave = raw_input("Introduce una clave: ")

# Metodo 1 con .get(c,e)
print "Metodo 1"
print dicl.get(clave,"Error no existe")

# Metodo 2 con has_key(c)
print "Metodo 2"
if dicl.has_key(clave) :
	print dicl.get(clave)
else :
	print "No existe"

# Metodo 3 mostrando la posicion de la clave
print "Metodo 3"
if dicl.has_key(clave) :
	for i,v in enumerate(dicl) :
		if v == clave :
			print "Posicion " + str(i)
else :
	print "No existe"

# Mostrar la posicion de todas las claves, borrar la introducida
# y volver a mostrar todas las claves
print "La posicion de todas las claves"

for i,v in enumerate(dicl) :
	print i,v

if dicl.has_key(clave) :
	dicl.pop(clave)

print dicl.keys()
