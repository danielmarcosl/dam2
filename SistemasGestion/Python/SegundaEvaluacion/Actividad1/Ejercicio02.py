#_*_coding_utf-8_*_

'''
Pedimos por teclado un directorio, como no sabemos si lo sera o no.
Indica que es lo que realmente se ha introducido.
'''

import os

def pedirDirectorio() :
	opcion = raw_input("Introduce nombre del archivo: ")
	return opcion

def comprobar(f) :
	if os.path.isfile(f) == True :
		print "Es un fichero"
	elif os.path.isdir(f) == True :
		print "Es un directorio"
	else :
		print "No se sabe"

# main

comprobar(pedirDirectorio())
# Nombre del fichero 'numeros.txt'
# Nombre del directorio 'aaa'
