#_*_coding:utf-8_*_

'''Invertir los valores de una Lista'''

def invertir(lista) :
	if lista == [] :
		return []
	else :
		return invertir(lista[1:]) + [lista[0]]
		
L = [3,4,5]

print invertir(L)
