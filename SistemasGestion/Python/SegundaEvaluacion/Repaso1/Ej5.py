#_*_coding:utf-8_*_

'''
Crear una clase coche que tenga el atributo gasolina y nos muestre los litros de
ella que tenemos.

Ademas debemos crear un metodo llamado arrancar que nos diga si podemos o no
hacerlo, tododepende si la cantidad de gasolina > 0

Crea otro metodo llamado conducir que nos debe probar que podemos arrancar
si lo hacemos debemos restar 1 a la cantidad de gasolina. Tambien nos debe
mostrar la cantidad de gasolina que nos queda y si no tenemos gasolina, mensaje no
nos movemos
'''

from coche import Coche

def arrancar(c) :
	if c.obtener_gasolina() > 0 :
		print "Podemos arrancar"
		return True
	else :
		print "No podemos arrancar"
		return False

def conducir(c) :
	if arrancar(c) :
		c.modificar_gasolina(int(c.obtener_gasolina()) - 1)
		print 'Tenemos ' + str(c.obtener_gasolina()) + ' litros de gasolina'
	else :
		print 'No nos movemos'

# main

sedan = Coche('15')

conducir(sedan)
