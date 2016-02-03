#_*_coding:utf-8_*_

def costo_total_paciente(rut) :
	suma = 0
	
	with open ('atenciones.txt', 'r') as at :
		for j in at.readlines() :
			k = j.strip().split(':')
			if (k[0] == rut) :
				suma += int(k[2])
	return str(rut) + " total a pagar " + str(suma)

def pacientes_dia(dia, mes, ano) :
	ruts = list()
	pacientes = list()
	
	# Anadimos los id a la lista 'ruts'
	with open ('atenciones.txt', 'r') as at :
		for j in at.readlines() :
			k = j.strip().split(':')
			fecha = k[1].split('-')
			
			if(dia == fecha[0] and mes == fecha[1] and ano == fecha[2]) :
				ruts.append(k[0])

	# Comprobamos si los ids coinciden
	# Si coinciden, se guarda el nombre en la lista 'pacientes'
	with open ('pacientes.txt', 'r') as pa :
		for i in pa.readlines() :
			lista = i.strip().split(':')
			for w in ruts :
				if(w == lista[0]):
					pacientes.append(lista[1])
				
	return pacientes

#main

with open ('pacientes.txt', 'r') as pa :
	print "Coste total por paciente"
	for i in pa.readlines() :
		l = i.strip().split(':')
		print costo_total_paciente(l[0])
		
print "\nPacientes en el dia senalado"
dia = raw_input("Introduce el dia: ")
mes = raw_input("Introduce el mes: ")
ano = raw_input("Introduce el ano: ")
print pacientes_dia(dia, mes, ano)
