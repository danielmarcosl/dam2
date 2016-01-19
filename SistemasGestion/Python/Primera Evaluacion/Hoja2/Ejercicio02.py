#_*_coding:utf-8_*_

'''Escribir un programa que pida un numero entero y escriba por pantalla:

'El numero introducido es PAR', en el caso de que sea par.
'El numero introducido es IMPAR', en el caso de que sea impar.'''

# Pedimos un numero entero
num = int(raw_input("Introduce un numero: "))

# Imprimimos un string dependiendo si es par o impar
if num%2 == 0 :
	print "El numero introducido es PAR"
elif num%2 != 0 :
	print "El numero introducido es IMPAR"
