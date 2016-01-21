#_*_coding:utf-8_*_

'''
Vamos a buscar un caracter en un fichero. Ambos datos los introducimos por
teclado. Nos debe mostrar un mensaje indicando si lo ha encontrado o no
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def preguntarCaracter() :
	return str(raw_input("Que caracter quieres buscar?: "))

def buscarCaracter(f) :
	caracter = preguntarCaracter()
	
	texto = f.read().split()
	for i in texto :
		letra = list(i)
		for j in letra :
			if j == caracter :
				print "Caracter encontrado en la palabra " + i
				
# main

f = open ('ej4.txt','r')
comprobarFichero(f)

buscarCaracter(f)

f.close()
comprobarFichero(f)
