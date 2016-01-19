#_*_coidng:utf-8_*_

'''Recibir una lista de enteros y retornar una lista con los numeros pares'''

def pares(lista) :
	if lista == [] :
		return []
	elif lista[0] % 2 == 0 :
		return [lista[0]] + pares(lista[1:])
	else :
		return pares(lista[1:])
		
print pares ([1,2,3,4,5,6,7,8,9])
