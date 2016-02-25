#_*_coding:utf-8_*_

'''
Escribir un programa que reciba dos nombres de archivo al ejecutarse, lo procese y nos debe
de decir si los dos ficheros se llaman igual. Si tienen distinto nombre.
Ademas nos debe comparar los dos ficheros y decir si son iguales o no en cuanto al contenido .
'''

import os

def comprobar_contenido(f1,f2) :
	with open (f1,'r') as file1:
		with open (f2,'r') as file2:
			contenido1 = file1.read()
			contenido2 = file2.read()
			if contenido1 == contenido2 :
				return 'El contenido es igual'
			else :
				return 'El contenido es distinto'

def comprobar_archivos(f1, f2) :
	if os.path.isfile(f1) == True :
		if os.path.isfile(f2) == True :
			if f1 == f2 :
				print 'Tienen el mismo nombre'
			else :
				print 'Tienen distinto nombre'
			print comprobar_contenido(f1,f2)
		else :
			print f2 + ' no es un fichero'
	else :
		print f1 + ' no es un fichero'

# main

comprobar_archivos(raw_input('Nombre 1º archivo: '), raw_input('Nombre 2º archivo: '))
 
