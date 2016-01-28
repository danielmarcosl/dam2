#_*_coding:utf-8_*_

'''Definir una funcion donde vamos a pasarle un numero indeterminado
de parametros, lo que queremos que haga nuestra función es:

Intercambiar la información del primer parametro con el ultimo que hayamos introducido.

Para ello mostraremos primero los parametros pasados y despues  aplicar el
cambio los parametros nuevamente con el primero y el ultimo intercambiados.'''

def intercambiar(*numeros) :
	
	print numeros
		
	numerosIntercambiados = list(numeros)
	
	nums = numerosIntercambiados[0]
	numerosIntercambiados[0] = numerosIntercambiados[-1]
	numerosIntercambiados[-1] = nums
	
	return numerosIntercambiados
	
print intercambiar(1,2,3,4,5,6)
