#_*_coding:utf-8_*_

'''
Vamos a crear una lista con numeros pares e impares. La vamos a leer
y a su vez escribir en un fichero solo los numeros impares de dicha lista.
Una vez creado el fichero debemos hacer La suma de todos los numeros impares del documento
'''

def crear_lista() :
	lista = list()
	for i in range(1,50) :
		lista.append(i)
	return lista

def escribir_impares(f,l) :
	with open (f,'w') as f1 :
		for j in l :
			if int(j) % 2 == 0 :
				f1.write(str(j) + '\n')

def hacer_suma(f) :
	suma = 0
	with open (f,'r') as f2 :
		for k in f2.readlines() :
			suma += int(k)
	return suma

# main

numeros = crear_lista()

escribir_impares('num.txt',numeros)

print hacer_suma('num.txt')
