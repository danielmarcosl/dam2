#_*_coding:utf-8_*_

a = 0
	
def esMenor(numeros) :
	return filter(lambda x : x <= a,numeros)
	
print esMenor([1,-2,0,-5])
