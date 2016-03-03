#_*_coding:utf-8_*_

'''
Funcion que recibe una lista ye l elemento a buscar, devolviendo su
posicion si existe y -1 en caso que no
'''

def buscar(l,e) :
	for c,i in enumerate(l) :
		if i == e :
			return c
	return -1

# main

lista = [1,2,3,4,5]

print "Posicion " + str(buscar(lista, 6))
