#_*_coding:utf-8_*_

# Ejercicio 3

# Metodo para mostrar la letra inicial
def mostrar_inicial(l) :
	# Declaramos la lista de las letras iniciales
	listaInicial = list()
	# Bucle para recorrer cada posicion de la lista
	for i in range(len(l)) :
		# Bucle para recorrer cada letra de la palabra de cada posicion de la lista
		for j in lista[i] :
			# Guardamos la letra en la lista
			listaInicial.append(j)
			# Acabamos el bucle for ya que solo queremos la primera letra
			break
	return listaInicial

# Metodo para mostrar la letra final
def mostrar_final(l) :
	# Declaramos la lista de las letras iniciales
	listaFinal = list()
	# Bucle para recorrer cada posicion de la lista
	for i in range(len(l)) :
		letra = str()
		# Bucle para recorrer cada letra de la palabra de cada posicion de la lista
		for j in lista[i] :
			# Guardamos cada letra en la variable
			letra = j
		# Al acabar el bucle, tendremos la ultima letra en la variable, la anadimos a la lista
		listaFinal.append(letra)
			
	return listaFinal

# Metodo para mostrar ambas
def mostrar_ambas(l) :
	# Bucle para recorrer cada posicion de la lista
	for i in range(len(l)) :
		# Declaramos la lista
		li = list()
		# Anadimos la primera letra
		li.append(lista[i][0:1:])
		# Anadimos la ultima letra
		li.append(lista[i][-1::])
		# La mostramos
		print li

# main

# Declaramos la lista 
lista = ["Ariel","Marcos","Ana","Luis","Pedro","Andres"]

# Declaramos la lista donde se guardaran la primera y ultima letra
lista2 = list()
# Anadimos la primera letra de cada nombre
lista2.append(mostrar_inicial(lista))
# Anadimos la ultima letra de cada nombre
lista2.append(mostrar_final(lista))
# Mostramos la lista
print lista2

# Salto de linea para separar
print "\n"

# Hacemos el otro modo
mostrar_ambas(lista)
