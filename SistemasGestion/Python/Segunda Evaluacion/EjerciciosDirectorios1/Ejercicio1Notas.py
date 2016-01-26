#_*_coding:utf-8_*_

'''
El programa debe imprimir el promedio de las notas de los
alumnos, asi como el nombre y las edades de dichos alumnos
'''

def contarLineas(f) :
	lineas = f.readlines()
	f.seek(0,0)
	return len(lineas)

def crearLista(s) :
	with open (s,'r') as f :
		lineas = contarLineas(f)
		media = 0;
		
		for i in f.readlines() :
			l = i.strip().split(':')
			print 'Nombre: ' + l[0] + ' ' + l[1] + ', con edad ' + l[2]
			media += float(l[3])
		print 'Media de notas ' + str(media/lineas)

# main

crearLista('c:/petra/ej1/archivo.txt')
