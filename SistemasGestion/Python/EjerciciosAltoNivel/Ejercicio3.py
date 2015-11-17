#_*_coding:utf-8_*_

def cuadrado(x) :
	return x**2
def cubo(x):
	return x**3
	
funcion = [cuadrado,cubo]

for i in range(16) :
	valor = map(lambda x : x(i),funcion)
	print valor
