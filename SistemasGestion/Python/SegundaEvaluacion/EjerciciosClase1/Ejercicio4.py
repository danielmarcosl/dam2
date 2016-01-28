#_*_coding:utf-8_*_

'''
Creamos un fichero o reutilizamos uno, y debe decirnos el número de
letras que hay en la primera linea del fichero y el numero de letras
que hay en la ultima linea del fichero
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def contarLineas(f) :
	lineas = 0
	for i in f.readlines() :
		lineas += 1
	return lineas

def contarLetras(f) :
	
	contadorLinea = 0
	maxLineas = contarLineas(f) -1
	f.seek(0,0)
	
	for i in f.readlines() :
			
		if contadorLinea == 0 or contadorLinea == maxLineas :
			contadorLetras = 0
			
			for j in i :
				contadorLetras += 1
				
			print contadorLetras
			
		contadorLinea += 1
			
# main

f = open ('menu.txt','r')
comprobarFichero(f)

contarLetras(f)

f.close()
comprobarFichero(f)
