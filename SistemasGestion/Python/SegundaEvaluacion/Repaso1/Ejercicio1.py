#_*_coding:utf-8_*_

'''
Definir una lista con una serie de elementos. 
lista=['juan','ana','luis','pedro']

Deberemos guardar los datos de la lista en un fichero, que deberemos comprobar que no exista previamente,
y guardar los datos dentro de el. Una vez finalizada la escritura, mostrar el contenido del fichero
'''

import os

def comprobar_fichero(f) :
	if os.path.isfile(f) == False :
		with open (f,'w') as f1 :
			for i in lista :
				f1.write(i + '\n')
		with open (f,'r') as f2:
			for j in f2.readlines():
				print j

# main

lista = ['juan','ana','luis','pedro']

comprobar_fichero(raw_input('Introduce nombre del fichero: '))
