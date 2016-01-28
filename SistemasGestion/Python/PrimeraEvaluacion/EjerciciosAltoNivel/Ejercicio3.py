#_*_coding:utf-8_*_

def cuadrado(x) :
	return x**2
def cubo(x):
	return x**3
	
funcion = [cuadrado,cubo]

for i in range(5) :
	valor = map(lambda x : x(i),funcion)
	print valor

print map(lambda x:(x*x, x*x*x), range(5))
