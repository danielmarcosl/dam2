#_*_coding:utf-8_*_

# Pedimos tres números y los almacenamos en variables tipo int
num1 = int(raw_input("Introduce un numero: "))
num2 = int(raw_input("Introduce un numero: "))
num3 = int(raw_input("Introduce un numero: "))

# Comprobamos si hay varios iguales
if num1 == num2 and num1 == num3 :
	print "Has escrito el mismo numero tres veces"
elif num1 == num2 or num1 != num3 or num2 == num3 :
	print "Has escrito uno de los numeros dos veces"
elif num1 != num2 and num1 != num3 :
	print "Los tres numeros que has escrito son distintos"
