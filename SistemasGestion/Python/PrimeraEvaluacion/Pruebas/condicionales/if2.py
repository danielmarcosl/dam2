#_*_coding:utf-8_*_
# Pedir tres números por teclado
# Ver cuál es el mayor de los tres

num1 = int(raw_input("Introduce un num: "))
num2 = int(raw_input("Introduce un segundo num: "))
num3 = int(raw_input("Introduce un tercer num: "))

if num1 > num2 and num1 > num3 :
	print "El num mayor es el primero " + str(num1)
elif num2 > num1 and num2 > num3 :
	print "El num mayor es el segundo " + str(num2)
elif num3 > num1 and num3 > num2 :
	print "El nummayor es el tercero " + str(num3)
