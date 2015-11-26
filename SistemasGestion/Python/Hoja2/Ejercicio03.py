#_*_coding:utf-8_*_

'''Escribir un programa que pida dos valores enteros
e imprima por pantalla el mayor de ellos:
'El número mayor es : <numero_mayor >'

Si son iguales se imprimira: 'Son iguales' '''

# Pide dos valores enteros y los almacena en variables tipo int
num1 = int(raw_input("Introduce un numero: "))
num2 = int(raw_input("Introduce otro numero "))

#Comprueba cuál es mayor
if num1 > num2 :
	print "%d es mayor"%(num1)
elif num2 > num1 :
	print str(num2) + " es mayor"
elif num1 == num2 :
	print "Son iguales"
