#_*_coding:utf-8_*_

# Ejercicio 4

# Aplicamos la funcion pasada al valor de la lista pasado
def aplicar(fun,n) :
	a = fun(n)   
	return a
	
# Metodo que trata cada valor de la lista
def tratamiento(l,num) :
	# Si la posicion de la lista es nulo, devolvemos la lista
	if num == (len(l)) :
		print l
	# Si el valor de la posicion es distinta a la siguiente, llamamos al metodo aplicar con una funcion
	else :
		l[num] = aplicar(lambda x : x + 1, l[num])
		num += 1
		tratamiento(l,num)
		
# main

# Lanzamos la funcion pricipal con una lista
tratamiento([1,2,3],0)
