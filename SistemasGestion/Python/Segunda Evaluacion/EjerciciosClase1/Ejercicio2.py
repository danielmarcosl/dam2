#_*_coding:utf-8_*_

'''
Suponemos que existe un archivo llamado menu.txt que contiene una
lista de comidas. El orden en el que se ha guardado la informacion es
“entrante”, “primero” y “postre”, asi sucesivamente. Lo que queremos
hacer es un pequeno menu que lea todos los entrantes de los que dispone
nuestro menu.txt, y que muestre el ultimo postre introducido.
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'
