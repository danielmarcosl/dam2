#_*_coding:utf-8_*_

'''
Escribir un programa, llamado head que reciba un archivo
y un numero N e imprima las primeras N lineas del archivo
'''

import os

N = 2

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def head(f) :
	for i, j in enumerate(f) :
		if i < N :
			print j

# main

f = open ('ej4.txt','r')
comprobarFichero(f)

head(f)

f.close()
comprobarFichero(f)
