#_*_coding_utf-8_*_

'''Elemento en la posicion k de una lista L'''

def pos(k,L) :
	if L == [] :
		return False
	elif k == 0 :
		return L[0]
	else :
		return pos(k-1, L[1:])
		
lista = [1,2,3,4,5,6]

print pos(2,lista)
