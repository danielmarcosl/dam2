#_*_coding:utf-8_*_

'''
Vamos a leer un fichero por teclado y nos debe leer palabra por palabra
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def leerFichero(f) :
	print "Pulsa ENTER para imprimir cada palabra"
	texto = f.read().split()
	
	for i in texto :
		algo = raw_input()
		print i

# main

f = open ('ej4.txt','r')
comprobarFichero(f)

leerFichero(f)

f.close()
comprobarFichero(f)
