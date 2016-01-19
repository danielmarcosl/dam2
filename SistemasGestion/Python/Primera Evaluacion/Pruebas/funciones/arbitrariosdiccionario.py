#_*_coding:utf-8_*_

def mostrar_parametros (p1, **argumento) :
	# Imprimimos el primer parametro
	print p1
	
	# Imprimimos el diccionario
	for i in argumento.items() :
		print i,
		
mostrar_parametros(1,segundo=2)
