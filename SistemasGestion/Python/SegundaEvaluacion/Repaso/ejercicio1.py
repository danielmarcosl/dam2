#_*_coding:utf-8_*_

import sys
import os

def comprobar_parametros() :
	if len(sys.argv) == 3 :
		return True
	else :
		return False

def cambiar_permisos() :
	os.system('chmod 570 directorido')
	os.system('chmod 570 directorido/ficherido')

def comprobar(*param) :
	if comprobar_parametros() :
		if os.path.isfile(sys.argv[0]) and os.path.isdir(sys.argv[1]) :
			print "Error, ya existen"
		else :
			os.system('mkdir directorido')
			os.system('touch directorido/ficherido')
			cambiar_permisos()
	else :
		print "Parametros mal metidos"

comprobar(sys.argv)
