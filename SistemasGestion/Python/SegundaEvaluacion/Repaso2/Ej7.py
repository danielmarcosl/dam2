#_*_coding:utf-8_*_

'''
Cree una clase llamada Persona. Contendra el nombre, dni, direccion, telefono y
e-mail (este ultimo opcional), saldo de un invididuo.

Por metodo tendra mostrar que imprimira por pantalla los datos de la persona.

Utilice esa clase para crear una lista de personas y mostra cada una de ellas.

Los datos de cda persona estan en el fichero personas.txt. El formato de este
fichero es una linea con los datos de cada persona. Estan separados por ';'.

Contiene informacion por este orden:
nombre;dni;direccion;telefono;e-mail;saldo
'''

from persona import Persona

def mostrar(p) :
	print p.obtener_datos()

# main

f = open('personas.txt','r')

for i in f.readlines() :
	p = Persona(i.strip().split(';'))
	mostrar(p)

f.close()
