#_*_coding:utf-8_*_

'''
Programa que lee nombres de fichero hasta que se introduzca alguno que realmente
coincida con el que le pasamos por parametro

Nos debe mostrar: Lo has encontrado, pero antes has cometido ***** fallos
'''

import sys
import os

from os import listdir
from os.path import isfile, join

def comprobar_nombre(s) :
		if s == sys.argv[1] :
			return True
		else :
			return False

# main

contador = 0
encontrado = False

while encontrado == False :
	encontrado = comprobar_nombre(raw_input("Introduce nombre de fichero: "))
	if encontrado == False :
		contador += 1

print "Lo has encontrado, pero antes has cometido " + str(contador) + " fallos"
