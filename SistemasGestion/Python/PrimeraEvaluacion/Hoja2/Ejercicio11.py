#_*_coding:utf-8_*_

'''
Vamos a pedir tres numero y debemos mostrar los
siguientes mensajes segun los valores introducidos:

Ha escrito uno de los numeros dos veces
Ha escrito tres veces el mismo numero

Los tres numeros que ha escrito son distintos'''

# Pedimos tres números y los almacenamos en variables tipo int
num1 = int(raw_input("Introduce un numero: "))
num2 = int(raw_input("Introduce un numero: "))
num3 = int(raw_input("Introduce un numero: "))

# Comprobamos si hay varios iguales
if num1 == num2 and num1 == num3 :
	print "Has escrito el mismo numero tres veces"
elif num1 == num2 or num1 == num3 or num2 == num3 :
	print "Has escrito uno de los numeros dos veces"
elif num1 != num2 and num1 != num3 :
	print "Los tres numeros que has escrito son distintos"
