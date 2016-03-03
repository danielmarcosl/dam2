#_*_coding:utf-8_*_

import os
import sys

def comprobar_fichero(f) :
	if os.path.isfile(f) :
		return True
	else :
		return False

def comprobar_parametros() :
	if len(sys.argv) == 2 :
		return True
	else :
		return False

def procesar(*p) :
	if comprobar_parametros() :
		fich = p[0][1]
		if comprobar_fichero(fich) :
			with open(fich,'r') as fr :
				print "Lineas:", len(fr.readlines())
		else :
			print "No es un fichero"
	else :
		print "Parametros esperados 1"
		print "Parametros introducidos: ", len(sys.argv) - 1
# main

procesar(sys.argv)
