#_*_coding:utf-8_*_

'''
Teniendo el fichero Ej4file.txt

Debemos volcar los datos de el fichero en un diccionario. Una vez alli debemos
mostrar:
	- Por un lado solo las palabras en ingles
	- Por otro las palabras en castellano
	- Por ultimo hacer una funcion que recibe una palabra por
	  parametros y nos debe mostrar su traduccion si dicha palabra no
	  se encuentra mensaje de error
'''

import sys

def crear_diccionario(f) :
	d = dict()
	with open (f,'r') as fr :
		for i in fr.readlines() :
			s = i.split()
			d[s[0]] = s[1]
	return d

def mostrar_ingles(d) :
	ingles = d.values()
	print "Ingles: ",
	for i in ingles:
		print i, 

def mostrar_castellano(d) :
	castellano = d.keys()
	print "\nCastellano: ",
	for i in castellano :
		print i,  
	print '\n'

def mostrar_traduccion(d) :
	pares = d.items()
	for i in pares :
		if i[0] == sys.argv[1] :
			print "Traduccion de " + str(sys.argv[1]) + ": " + str(i[1])
		if i[1] == sys.argv[1] :
			print "Traduccion de " + str(sys.argv[1]) + ": " + str(i[0])

# main

palabras = crear_diccionario('Ej4file.txt')

mostrar_ingles(palabras)
mostrar_castellano(palabras)
mostrar_traduccion(palabras)
