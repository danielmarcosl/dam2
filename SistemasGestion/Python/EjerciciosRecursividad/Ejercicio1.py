#_*_coding:utf-8_*_

def largo(lista) :
	if lista == [] :
		return 0
	else :
		return 1 + largo(lista[1:])

L = ['a','b','c','d','e']

print largo(L)
