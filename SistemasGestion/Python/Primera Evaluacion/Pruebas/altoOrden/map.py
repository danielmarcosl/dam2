#_*_coding:utf-8_*_

def porDos(n) :
	return n*2
	
def multiPorDos(lista) :
	return map(porDos,lista)
	
#main
print multiPorDos([1,4,5,2,3,10])
