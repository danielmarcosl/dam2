#_*_coding:utf-8_*_

'''Recibir una lista de enteros y retornar una lista con los numeros pares'''

def pares(lista) :
	if lista == [] :
		return P
	elif lista[0] % 2 == 0 :
		P.append(lista[0])
		return pares(lista[1:])
	else :
		return pares(lista[1:])
		
L = [1,2,3,4,5,6,7,8,288]
P = list()

print pares(L)
