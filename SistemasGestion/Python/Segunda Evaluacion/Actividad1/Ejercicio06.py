#_*_coding:utf-8_*_

'''
Vamos a repetir el ejercicio anterior pero ahora
a demas nos debera decir en que linea lo ha encontrado
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
	countlinea = 0
	for i in texto :
		letra = list(i)
		countchar = 0
		for j in letra :
			if j == caracter :
				print "Caracter encontrado en la palabra " + i + ", en la linea " + str(countlinea) + ", en la posicion " + str(countchar)
			countchar += 1
		countlinea +=1

# main

f = open ('ej4.txt','r')
comprobarFichero(f)

buscarCaracter(f)

f.close()
comprobarFichero(f)
