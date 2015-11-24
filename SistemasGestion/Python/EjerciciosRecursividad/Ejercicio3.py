#_*_coding:utf-8_*_

def ultimoElemento(lista) :
	if lista == [] :
		return False
	elif lista[1:] == [] :
		return lista[0]
	else :
		return ultimoElemento(lista[1:])

L = ['a','b','c','d','e']

print ultimoElemento(L)
