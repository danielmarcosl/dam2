#_*_coding:utf-8_*_

'''
Definir una lista con una serie de elementos

Deberemos guardar los datos de la lista en un fichero, que deberemos comprobar
que no exista previamente, y guardar los datos dentro de él. Una vez finalizado
la escritura, mostrar el contenido del fichero
'''

import os

def existe_fichero(f) :
	if os.path.isfile(f) :
		return True
	else :
		return False

def guardar_lista(f,l) :
	if existe_fichero(f) :
		print 'El fichero ya existe'
	else :
		with open (f,'w') as fw :
			for i in l :
				fw.write(i + '\n') 
		leer_fichero(f)

def leer_fichero(f) :
	with open (f,'r') as fr :
		for i in fr.readlines() :
			print i + '\n'

# main

lista = ['Juan','Ana','Luis','Pedro']

fich = 'Ej1file.txt'

guardar_lista(fich,lista)
