#_*_coding:utf-8_*_

'''
Modifique el ejercicio anterior de la siguiente forma:
	- Si el numero de parametros es 1, muestre el siguiente mensaje por pantalla
	  Error: Necesito msa de un numero
	- Si el numero de parametros es igual a dos, calcule la suma de ambos
	- Si se pasan 3 o mas parametros, realice las operaciones suma de forma
	  asociativa y muestre su resultado
'''

import sys

def sumar(*params) :
	nums = list(params[0])
	suma = 0
	print nums
	for i in nums :
		suma += int(i)
	return suma

def operar(*params) :
	lista = list(params[0])
	lista.pop(0)
	if len(sys.argv) == 1 :
		return "Necesito mas de un numero"
	elif len(sys.argv) == 2 :
		return sumar(lista[0], lista[1])
	elif len(sys.argv) >= 3 :
		return sumar(lista)
	

# main

print operar(sys.argv)
