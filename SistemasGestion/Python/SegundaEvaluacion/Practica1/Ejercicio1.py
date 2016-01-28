#_*_coding:utf-8_*_

'''
Escribir un programa que  abra  un archivo  lo procese e imprima por pantalla
cuantas lineas, cuantas palabras y cuántos caracteres contiene el archivo. 
'''

def contarCaracteres(f) :
	caracteres = f.read()
	return len(caracteres)

def contarPalabras(f) :
	f.seek(0,0) # Ponemos el puntero al principio del fichero
	palabras = f.read().split()
	return len(palabras)

def contarLineas(f) :
	f.seek(0,0) # Ponemos el puntero al principio del fichero
	lineas = f.readlines()
	return len(lineas)

def contar(f) :
	print "El fichero contiene"
	print str(contarCaracteres(f)) + " caracteres"
	print str(contarPalabras(f)) + " palabras"
	print str(contarLineas(f)) + " lineas"

# main

with open ('f1.txt','r') as f :
	contar(f)
