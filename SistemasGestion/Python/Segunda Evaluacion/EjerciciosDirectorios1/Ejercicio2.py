#_*_coding:utf-8_*_

'''
Vamos a pedir por teclado un dato y vamos a comprobar
si ese dato es un fichero o un directorio
'''

import os

def comprobar(s) :
	if os.path.isfile(s) :
		print 'Es un archivo'
	elif os.path.isdir(s) :
		print 'Es un directorio'

# main

'''
Si es un fichero nos vamos a situar en la penúltima frase de dicho fichero y la vamos a mostrar
Si es un directorio, comprobar si es el directorio actual, mostrar un mensaje para decir sí lo es o no y comprobar si hay archivos con una extensión pedida por teclado. Si la hay, mostrar los archivos con esa extensión, sino, mostrar mensaje de error diciendo que no existe archivo con esa extensión.
'''
