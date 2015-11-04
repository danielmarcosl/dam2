#_*_coding:utf-8_*_

def mostrar_parametros (p1, *argumento) :
	# Imprimimos el primer parametro
	print p1
	
	# Imprimimos la tupla
	for i in argumento :
		print i,
		
mostrar_parametros('hola',3,5,'adios',100)
