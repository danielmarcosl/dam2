#_*_coding_utf-8_*_

'''
Escribe una funcion sumador(fichero) que, dado el nombre de un
fichero te texto que contiene numeros separados por espacios
en blanco, devuelva la suma de dichos numeros
'''

import os

def sumador(f) :
	numeros = f.read().split()
	suma = 0
	
	for i in numeros :	
		suma += int(i)
		
	return suma

# main

f = open ('numeros.txt','r')

print sumador(f)
