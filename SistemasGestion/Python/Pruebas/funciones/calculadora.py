#_*_coding:utf-8_*_

import math

num1 = int(raw_input("Introduce un primer numero: "))
num2 = int(raw_input("introduce un segundo numero: "))
operacion = raw_input("""Que operacion desea realizar?
a) Suma
b) Resta
c) Multiplicacion
d) Division
""")

def operar(signo) :
	def suma() :
		num1.add(num2)
		return num1
	def multi() :
		return num1 * num2
	def resta() :
		b = sub(num1,num2)
		return b
	dicti = {'+':suma(),'-':resta(),'*':multi(),'/':(lambda num1,num2 : num1 / num2)}
	return dicti[signo]	
	

f = operar(operacion)
print f
