#_*_coding:utf-8_*_

'''
Funcion muestra(ruta). Si ruta es un directorio, muestra el contenido del directorio.
Si es un nombre de archivo, muestra el contenido del archivo en pantalla
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def muestra(ruta) :
	if os.path.isdir(ruta) == True :
		lista = os.listdir(ruta)
		for i in lista :
			print i
	elif os.path.isfile(ruta) == True :
		with open (ruta,'r') as f :
			print f.read()
	else :
		print "No se sabe"

# main

muestra(raw_input("Introduce una ruta: "))
# Nombre del directorio 'aaa'
# Nombre de archivos 'ej4.txt' 'numeros.txt'
