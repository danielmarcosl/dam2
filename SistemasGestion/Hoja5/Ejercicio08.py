#_*_coding:utf-8_*_

linea = "a"
lista = []

while linea != " ":
	linea = raw_input("Introduzca elemento: ")
	lista.append(linea)
	
for i in range (len(lista)):
	print lista[i]
