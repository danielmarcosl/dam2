#_*_coding:utf-8_*_

'''
Programa una calculadora que funcione por linea de comandos para las operaciones
de suma, resta, multiplicacion y division, y para un maximo de 2 numeros enteros
(sumar, restar, multiplicar y dividir dos numeros enteros). Debe reconocer los
simbolos usuales de estas operaciones: "+", "-", "*", "/". Debes usar funciones,
una para cada operacion
'''

def sumar(n1, n2) :
	return int(n1) + int(n2)

def restar(n1, n2) :
	return int(n1) - int(n2)

def multiplicar(n1, n2) :
	return int(n1) * int(n2)

def dividir(n1, n2) :
	return int(n1) / int(n2)

def operar(o, n1, n2) :
	if o == '+' :
		return sumar(n1, n2)
	elif o == '-' :
		return restar(n1, n2)
	elif o == '*' :
		return multiplicar(n1, n2)
	elif o == '/' :
		return dividir(n1, n2)
	else :
		return "Parametro mal introducido"

# main

print "Resultado: " + str(operar(raw_input("Introduce la operacion(+ - * /): "),
raw_input("Introduce el primer numero: "),
raw_input("Introduce el segundo numero: ")))
