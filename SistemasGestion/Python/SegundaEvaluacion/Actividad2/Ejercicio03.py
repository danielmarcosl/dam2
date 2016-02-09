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
	print '''Bienvenido al menu del ejercicio 3!
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

# main

menu()

lista = generarLista(10)

print lista
