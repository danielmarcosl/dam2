#_*_coding:utf-8_*_

# Pedimos dos valores enteros y los almacenamos
num1 = int(raw_input("Introduce un num: "))
num2 = int(raw_input("Introduce otro num: "))

# Comprobamos si el primero es menor
if num1 < num2 :
	print "Primero menor"
# Comprobamos si el segundo es menor
elif num2 < num1 :
	print "Segundo menor"
# Comprobamos si son iguales
elif num1 == num2 :
	print "Son iguales"
