#_*_coding:utf-8_*_

'''
Escribir en un fichero separado por tabuladores la informacion de un
paciente que tenemos disponible en el siguiente diccionario:
paciente = {'nombre': 'Donald', 'edad': 42, 'Diabetico': True}
'''

def escribirInfo(f,d) :
	claves = d.keys()
	valores = d.values()
	contador = 0
	
	for i in claves :
		f.write(i + '\t' + str(valores[contador]) + '\t')
		contador += 1

# main

paciente = {'nombre': 'Donald', 'edad': 42, 'Diabetico': True}

f = open ('paciente.txt','w')

escribirInfo(f,paciente)

f.close()

with open ('paciente.txt','r') as f2 :
	print f2.read()
