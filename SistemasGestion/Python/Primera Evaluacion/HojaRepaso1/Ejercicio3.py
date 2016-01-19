#_*_coding:utf-8_*_

'''Escribir una funcion que reciba una lista de tuplas, y que devuelva un 
diccionario en donde las claves sean los primeros elementos de las tuplas
y los valores una lista con los segundos'''


def tuplas_a_diccionario(lista):
	dicc={}	# Creamos diccionario
	for i in lista: # Iteramos la lista
		if (i[0] in dicc)==False: # Comprobamos si el primer elemento de cada tupla está introducido en el diccionario como clave
			dicc[i[0]]=[i[1]] # Si no está introducido, lo introducimos y anadimos el segundo elemento como valor
		else:
			dicc[i[0]].append(i[1]) # Si ya esta la clave introducida, anadimos el segundo elemento de la tupla a la lista del valor
	return dicc # Devuelve el diccionario

l = [('Hola', 'don Pepito'), ('Hola', 'don Jose'), ('Buenos', 'dias')]

print tuplas_a_diccionario(l)
