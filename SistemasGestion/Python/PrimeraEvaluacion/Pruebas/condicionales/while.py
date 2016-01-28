#_*_coding:utf-8_*_

# Pedir una palabra
# Si es distinta a fin, guardar en una lista todas las palabras introducidas
# Cuando se introduzca fin, imprimir la lista

lista = []

palabra = raw_input("Introduce palabra: ")

while palabra != "fin" :
	
	lista.append(palabra)
	palabra = raw_input("Introduce palabra: ")

print lista
