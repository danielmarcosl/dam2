#_*_coding:utf-8_*_
	
def esMenor(numeros) :
	return filter(lambda x : x < 0,numeros)

print esMenor(range(-5,5))
