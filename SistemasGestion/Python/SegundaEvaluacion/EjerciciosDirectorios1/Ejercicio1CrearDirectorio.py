#_*_coding:utf-8_*_

'''
Vamos a crear un directorio que vamos a pedir por teclado
si dicho directorio ya existe: mensaje de error
'''

import os

def comprobarSiExiste(s) :
	if os.path.isdir(s) :
		print "Ya existe"
	else :
		return True

def crearDirectorio(s) :
	if comprobarSiExiste(s) == True :
		os.system('mkdir ' + s)
		print "Directorio creado"

# main

crearDirectorio(str(raw_input('Introduce una ruta: ')))
