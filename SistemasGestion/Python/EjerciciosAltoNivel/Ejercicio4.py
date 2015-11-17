#_*_coding:utf-8_*_

def media(numeros) :
	return reduce(lambda a,b : a + b,numeros) / len(numeros)

print media([1,2,3,4,5])
