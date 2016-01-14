#_*_coding:utf-8_*_

'''
Mostrar el contenido de un fichero de texto cuyo nombre es
introducido por el usuario. Realizar todas las comprobaciones
pertinentes antes de leerlo linea a linea
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def pedirDirectorio() :
	opcion = raw_input("Introduce nombre del archivo: ")
	return opcion

# main

archivo = open (pedirDirectorio(), "r")
comprobarFichero(archivo)

print archivo.read()

archivo.close()
comprobarFichero(archivo)
