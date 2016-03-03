#_*_coding:utf-8_*_

from perro import Perro

def escribir_fichero(f) :
	with open (f,'w') as fw :
		fw.write('Chihuahua;2;Mexico\n')
		fw.write('Boxer;17;Vallecas\n')
		fw.write('Perropatada;6;Madrid')

def crear_perros(f) :
	perros = list()
	with open (f,'r') as fr :
		for i in fr.readlines() :
			p = i.strip().split(';')
			perros.append(Perro(p[0],p[1],p[2]))
	return perros

def mostrar_datos(l) :
	print "Datos de perros"
	for i in lista :
		i.mostrar()

def mayor_peso(l) :
	pesos = list()
	for i in l :
		pesos.append(int(i.mostrar_peso()))
	return max(pesos)

# main

#Nombre fichero
fich = 'perros.txt'

#Escribimos el fichero
escribir_fichero(fich)
#Creamos la lista de perros leyendo del fichero
lista = crear_perros(fich)

#Mostramos datos de los perros
mostrar_datos(lista)

#Mostramos el mayor peso
print mayor_peso(lista)
