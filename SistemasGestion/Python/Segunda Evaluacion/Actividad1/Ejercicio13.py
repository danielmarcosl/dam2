#_*_coding:utf-8_*_

'''
Por ejemplo, supongamos que tenemos el archivo mensaje .txt
que tiene el siguiente contenido:
Puro  Aire
es tu cielo azulado
puras brisas
te cruzan tambien
El archivo tiene cuatro lineas. Cada linea termina con un salto de
linea (\n), que indica que a continuacion comienza una linea nueva.
Se nos pide  crear una funcion a la que le pasaremos el fichero
que contiene ese mensaje y nos debe pintar la primera letra de cada linea
'''

def imprimirInicial(f) :
	for i in f.readlines() :
		linea = i
		print linea[0]

# main

f = open ('poema.txt','r')

imprimirInicial(f)

f.close()
