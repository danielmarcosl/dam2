#_*_coding:utf-8_*_

'''Escribir un programa que pida dos valores enteros. Y que imprima por pantalla:

Si el primero es menor que el segundo, que imprima el mensaje 'Primero menor'. 
Si el segundo es menor que el primero, que imprima el mensaje 'Segundo menor'. 
Si los numeros son iguales, que imprima el mensaje 'Son iguales'.'''

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
