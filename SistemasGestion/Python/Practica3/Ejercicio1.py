#_*_coding:utf-8_*_

def intercambiar(*numeros) :
	
	print numeros
		
	numerosIntercambiados = list(numeros)
	
	nums = numerosIntercambiados[0]
	numerosIntercambiados[0] = numerosIntercambiados[-1]
	numerosIntercambiados[-1] = nums
	
	return numerosIntercambiados
	
print intercambiar(1,2,3,4,5,6)
