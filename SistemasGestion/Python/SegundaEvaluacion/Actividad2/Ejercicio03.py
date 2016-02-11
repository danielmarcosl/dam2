#_*_coding:utf-8_*_

'''
Vamos a crear una programa que  nos pinte un menú de opciones y según la
que se seleccione debemos llamar a una función determinada

1. generar números aleatorios entre 49999 y 99999 que guardaremos
en una lista
2. Elegir de la lista anterior un número al azar
3. Elegir de la lista anterior 5 números al azar
4. Reordenar los elementos de la lista anterior
5. Salir
'''

import random

def menu() :
	return '''Bienvenido al menu del ejercicio 3!
	1. Numeros aleatorios entre 49999 y 99999
	2. Elegir un numero al azar entre los anteriores
	3. Elegir 5 numeros al azar entre los anteriores
	4. Reordenar elementos
	5. Salir'''

def generarLista(n) :
	l = list()

	for i in range(n) :
		l.append(random.randint(49999,99999))
	return l

def numeroAzar(l) :
	return random.choice(l)

def variosNumerosAzar(l) :
	return random.sample(l,5)

def reordenar(l):
	l.sort()
	return l

def pedirOpcion() :
	o = int(raw_input("Escoge una opcion: "))
	return o

# main

print menu()

opcion = 0
lista = list()

while opcion != 5 :

	opcion = pedirOpcion()

	if opcion == 1 :
		lista = generarLista(10)
		print lista
	elif opcion == 2 :
		print numeroAzar(lista)
	elif opcion == 3 :
		print variosNumerosAzar(lista)
	elif opcion == 4 :
		lista = reordenar(lista)
		print lista
	elif opcion == 5 :
		print "Gracias por su visita"
	else :
		print "Opcion no valida"
