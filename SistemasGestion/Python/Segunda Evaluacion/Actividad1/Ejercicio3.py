#_*_coding_utf-8_*_

'''
Escribe una funcion sumador(fichero) que, dado el nombre de un
fichero te texto que contiene numeros separados por espacios
en blanco, devuelva la suma de dichos numeros
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'


def sumador(f) :
	numeros = f.read().split()
	suma = 0
	
	for i in numeros :	
		suma += int(i)
		
	return suma

# main

f = open ('numeros.txt','r')
comprobarFichero(f)

print sumador(f)

f.close()
comprobarFichero(f)
