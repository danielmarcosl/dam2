#_*_coding:utf-8_*_

import os

def comprobarFichero(d) :
	if (d, os.W_OK) :
		print "Fichero OK, Escritura OK"
	else :
		print "Fichero no OK"

def escribirMenu(d) :
	for i in range(3) :
		nombre = raw_input("Introduce Nombre de producto: ")
		identificacion = raw_input("Introduce Identificacion de producto: ")
		precio = raw_input("Introduce precio de producto: ")
		
		d.writelines(nombre + " " + identificacion + " " + precio + "\n")

def leerMenu(d) :
	for i in range(3) :
		print d.readline()

#main
datos = open("datos.txt","w")

comprobarFichero(datos)

escribirMenu(datos)

datos.close()

comprobarFichero(datos)

datos2 = open("datos.txt","r")

comprobarFichero(datos2)

leerMenu(datos2)

datos2.close()

comprobarFichero(datos2)
