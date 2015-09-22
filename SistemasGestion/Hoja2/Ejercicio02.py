#_*_coding:utf-8_*_

# Pedimos un numero entero
num = int(raw_input("Introduce un numero: "))

# Imprimimos un string dependiendo si es par o impar
if num%2 == 0 :
	print "El numero introducido es PAR"
elif num%2 != 0 :
	print "El numero introducido es IMPAR"
