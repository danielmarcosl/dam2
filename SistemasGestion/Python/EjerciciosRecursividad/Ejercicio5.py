#_*_coding:utf-8_*_

'''Concatenar dos listas L y M'''

def concatenar(L,M) :
	if L == [] :
		return [] + M
	else :
		return [L[0]] + concatenar(L[1:],M)

L = [1,2,3,4,5]
M = [6,7,8,9,0]

print concatenar(L,M)
