#_*_coding:utf-8_*_

'''
Vamos a pasar tres ficheros por teclado y luego dichos ficheros como parametro
en una funcion “conca”. Dicha funcion debe concatenar los dos primeros, si son ficheros,
en el tercero si tambien lo es. Una vez concatenados la
funcion pintara el tercer fichero para ver el resultado
'''

import os

def compr(f) :
	return os.path.isfile(f)

def comprobar(f1,f2,f3) :
	if compr(f1) == True :
		if compr(f2) == True :
			if compr(f3) == True :
				concat(f1,f2,f3)
			else :
				print "El tercer parametro no es un fichero"
		else :
			print "El segundo parametro no es un fichero"
	else :
		print "El primer parametro no es un fichero"

def concat(f1,f2,f3) :
	with open (f1,'r') as fichero1lectura :
		with open (f2,'a') as fichero2 :
			fichero2.write('\n' + fichero1lectura.read())
		with open (f2,'r') as fichero2lectura :
			with open (f3,'a') as fichero3 :
				fichero3.write('\n' + fichero2lectura.read())
		with open (f3,'r') as fichero3lectura :
			print fichero3lectura.read()

# main

comprobar(str(raw_input("Introduce un primer fichero: ")),
str(raw_input("Introduce un segundo: ")),
str(raw_input("Introduce un tercero: ")))
# Nombres de ficheros fich1.txt fich2.txt fich3.txt
