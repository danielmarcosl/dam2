#_*_coding:utf-8_*_

def sumar(a,b) :
	return a + b
	
def sumarConReduce(numeros) :
	return reduce(sumar,numeros)
	
#main

print sumarConReduce([2,3,10,11])
