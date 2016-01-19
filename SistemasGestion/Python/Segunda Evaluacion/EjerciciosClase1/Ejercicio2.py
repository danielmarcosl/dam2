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

def entrantes(f) :
	contador = 0
	for i in f.readlines() :
		if contador == 0 :
			print i
			contador += 1
		elif contador == 2 :
			contador = 0
		else :
			contador += 1

# main

f = open ('menu.txt','r')

comprobarFichero(f)

entrantes(f)

f.seek(-8,2)
print f.readline()
