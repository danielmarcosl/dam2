#_*_coding:utf-8_*_

def esPositivo(n) :
	return n >= 0
	
def filterPositivo(numero) :
	return filter(esPositivo,numero)
	
print filterPositivo([2,-1,4,0,10])

print filter(lambda a: a>=0,[2,-1,4,0,10])
