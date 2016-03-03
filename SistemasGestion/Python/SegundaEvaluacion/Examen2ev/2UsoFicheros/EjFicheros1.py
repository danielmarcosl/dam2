#_*_coding:utf-8_*_

def escribir_fichero(f) :
	with open(f,'w') as fw :
		fw.write('Daniel 24 Si\n')
		fw.write('Silvia 17 Si\n')
		fw.write('Manolo 50 No\n')
		fw.write('Alicia 15 No')

def obtener_alumnos(f) :
	alumnos = list()
	with open(f,'r') as fr :
		for i in fr.readlines() :
			alumn = list()
			for j in i.strip().split(' ') :
				alumn.append(j)
			alumnos.append(alumn)
	return alumnos

def filtrar_alumnos(l) :
	for c,i in enumerate(l) :
		if int(i[1]) < 18 :
			l.pop(c)

def guardar_matriculados(l) :
	with open('matriculados.txt','w') as fw2 :
		for i in l :
			for j in i :
				fw2.write(j + ' ')
			fw2.write('\n')
	with open('matriculados.txt','r') as fr2 :
		for i in fr2.readlines() :
			print i

# main

fich = 'alumnos.txt'

#Creamos el fichero
escribir_fichero(fich)

#Leemos los alumnos del fichero y los guardamos en una lista
lista = obtener_alumnos(fich)

#Filtramos los que no sean mayores de edad
filtrar_alumnos(lista)

#Guardaremos los restantes en otro fichero
guardar_matriculados(lista)
