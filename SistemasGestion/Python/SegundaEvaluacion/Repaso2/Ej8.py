#_*_coding:utf-8_*_

'''
Cree una clase Entidad. Contendra por atributos el numero de entidad, su director
y clientes. Los dos primeros datos seran proporcionados al crear la entidad. Los
siguientes se leeran del fichero personas.txt.

La clase entidad tendra dos metodos:
	- num_clientes, devolvera el numero de clientes asociados a la entidad.
	- balance, que devolvera la suma de los saldos de los clientes de la entidad.
'''

import sys
from entidad import Entidad
from persona import Persona

def crear_personas() :
	p = list()
	with open ('personas.txt','r') as f :
		for i in f.readlines() :
			p.append(Persona(i.strip().split(';')))
	return p

# main

personas = crear_personas()

entidad = Entidad(sys.argv[1], sys.argv[2],len(personas))

print "El numero de clientes es ", entidad.num_clientes()
