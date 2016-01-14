#_*_coding_utf-8_*_

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
