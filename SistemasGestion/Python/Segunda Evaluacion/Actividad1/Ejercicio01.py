#_*_coding:utf-8_*_

'''
Escribir los numeros pares comprendidos entre
el 1 y el 100 en un fichero y luego lo muestras
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def escribirPares(f) :
	for i in range(100) :
		if i % 2 == 0 :
			f.write(str(i) + " ")

# main

# Escribimos en el fichero
escribir = open('numeros.txt','w')
comprobarFichero(escribir)

escribirPares(escribir)

escribir.close()
comprobarFichero(escribir)

# Leemos del fichero
leer = open ('numeros.txt','r')
comprobarFichero(leer)

print leer.read()

leer.close()
comprobarFichero(leer)
