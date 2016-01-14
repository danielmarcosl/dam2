#_*_coding_utf-8_*_

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def sumador(f) :
	

# main

archivo = open ('','r')
