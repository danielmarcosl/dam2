#_*_coding:utf-8_*_

'''
Vamos a crear una lista con numeros pares e impares. Le vamos a leer y a su vez
escribir en un fichero sololos numeros impares de dicha lista.

Una vez creado el fichero debemos hacer la suma de todos los numeros impares del documento
'''

def crear_lista() :
	lista = list()
	for i in range(1,100) :
		lista.append(i)
	return lista


def escribir_lista(f,l) :
	with open (f,'w') as fw :
		for i in l :
			if int(i) %2 != 0 :
				fw.write(str(i) + ' ')
	hacer_suma(f)

def hacer_suma(f) :
	with open(f,'r') as fr :
		numeros = fr.read().split()
		suma = 0
		for i in numeros:
			suma += int(i)
		print 'Suma: ' + str(suma)

# main

escribir_lista('num.txt',crear_lista())
