#_*_coding:utf-8_*_

'''
Dado el siguiente fichero con informacion sobre pacientes:
Nombre edad Diabetico
Daniel 42 Si
Jose 15 Si
Manolo 50 No
Alicia 12 No
Imprimir en un nuevo fichero los pacientes que tienen mas de 20 anos
y no son diabeticos.
'''

def guardarPacientes(f) :
	texto = f.read().split()
	pacientes = list() # Lista con listas de datos de los paciente
	p = list() # Lista temporal con datos de un paciente
	contador = 0
	
	for i in texto :
		if contador < 2 :
			p.append(i)
			contador += 1
		else :
			p.append(i)
			pacientes.append(p[:]) # Anadimos la lista
			del p [:] # Borramos la lista
			contador = 0
	return pacientes

def imprimirSeleccionado(l) :
	for i in range(len(l)) :
		if l[i][1] > 20 and l[i][2] == 'No' :
			return l[i]

# main

f = open ('fichapacientes.txt','r')

lista = guardarPacientes(f)

f.close()

print imprimirSeleccionado(lista)
