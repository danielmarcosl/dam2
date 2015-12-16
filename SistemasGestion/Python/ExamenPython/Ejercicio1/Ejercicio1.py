#_*_coding:utf-8_*_

# Ejercicio 1
# Definir una lista con un conjunto de nombres e imprimir la
# cantidad de ellos que comienzan con la letra a

# Declaracion de lista
lista = ["Adolfo","Maria","Ana","Alex","Felipe"]
# Declaracion de variable para contar el numero de nombres que empiezan por A
contador = 0
	
# Bucle para recorrer cada posicion de la lista
for i in range(len(lista)) :
	# Bucle para recorrer cada letra de la palabra de cada posicion de la lista
	for l in lista[i] :
		# Transformamos la primera letra a mayuscula y comprobamos si coincide con la letra A
		if l.upper() == 'A' :
			# Si coincide aumentamos el contador
			contador += 1
		# Acabamos el bucle for ya que solo queremos comprobar la primera letra
		break
		
# Imprimimos el resultado
print "El numero de personas cuya inicial es A es: " + str(contador)
