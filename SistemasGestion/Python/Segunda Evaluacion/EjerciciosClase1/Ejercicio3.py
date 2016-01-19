#_*_coding:utf-8_*_

'''
Vamos a crear en python nuestra propia versión del comando COPY,
para ello copiaremos el contenido de un fichero en otro. Al final,
mostraremos los dos ficheros y el contenido tiene que ser idéntico.
'''

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def copiar(f,f2) :
	for i in f.readlines() :
		f2.writelines(i)

def mostrarFicheros(f,f2) :
	f.seek(0,0)
	print f.readlines()
	print f3.readlines()
	
# main

f = open ('fichero.txt','r')
f2 = open ('fichero2.txt','w')
comprobarFichero(f)
comprobarFichero(f2)

copiar(f,f2)

f2.close()
comprobarFichero(f2)

f3 = open ('fichero2.txt','r')
comprobarFichero(f3)

mostrarFicheros(f,f3)
