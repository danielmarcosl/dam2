#_*_coding:utf-8_*_

'''
Escribir un programa que reciba dos nombres de archivo al ejecutarse, lo
procese y nos debe de decir si los dos ficheros se llaman igual o si tienen
distinto nombre.

Ademas nos debe comparar los dos ficheros y decir si son iguales o no en cuanto
al contenido
'''

import sys
import os

def comprobar_parametros() :
	if len(sys.argv) == 3 :
		return True
	else :
		print "Numero de parametros esperados: 2"
		print "Numero de parametros pasados: " + str(len(sys.argv) - 1)
		return False

def existen_ficheros(f1,f2) :
	if os.path.isfile(f1) :
		if os.path.isfile(f2) :
			return True
		else :
			print "El segundo fichero no existe"
			return False
	else :
		print "El primer fichero no existe"
		return False

def comprobar_iguales(f1,f2) :
	if f1 == f2 :
		print "Tienen el mismo nombre"
	else :
		print "Tienen distinto nombre"

def comprobar_contenido(f1,f2) :
	with open (f1,'r') as f1r :
		with open (f2,'r') as f2r :
			contenido1 = f1r.read()
			contenido2 = f2r.read()
			if contenido1 == contenido2 :
				print "Tienen el mismo contenido"
			else :
				print "Tienen contenido distinto"

def procesar(archivos) :
	if comprobar_parametros() :
		if existen_ficheros(archivos[1], archivos[2]) :
			comprobar_iguales(archivos[1], archivos[2])
			comprobar_contenido(archivos[1], archivos[2])

# main

procesar(sys.argv)
