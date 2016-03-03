#_*_coding:utf-8_*_

'''Escribir un programa que reciba un nombre de archivo al ejecutarse,
 lo procese e imprima por pantalla su contenido contiene el archivo.'''
 
import sys
def imprimirArchivo(name = sys.argv[1]):
	fich = open(name,'r')
	print fich.read()
	fich.close()

imprimirArchivo()
