#_*_coding:utf-8_*_

import math

def crear_fichero(f) :
	with open(f,'w') as fw :
		fw.write('Perico:Los Palotes:90:75:38:65\n')
		fw.write('Yayita:Vinagre:39:49:58:55\n')
		fw.write('Fulanita:De Tal:96:100:36:71')

def obtener_notas(f) :
	notas = list()
	with open(f,'r') as fr :
		for i in fr.readlines() :
			n = list()
			for j in i.strip().split(':') :
				n.append(j)
			notas.append(n)
	return notas

def mostrar_media(l) :
	for i in l :
		print str(i[0]) + str(i[1]) + " obtuvo: " + str(media((i[2],i[3],i[4],i[5])))

def media(*params) :
	nums = params[0]
	media = 0
	for i in nums :
		media += float(i)
	media /= len(nums)
	return media

# main

fich = 'notas.txt'

#Creamos el fichero
crear_fichero(fich)

#Recogemos los valores del fichero en una lista
lista = obtener_notas(fich)

#Mostramos la media
mostrar_media(lista)
