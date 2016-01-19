#_*_coding:utf-8_*_

'''Implementar una funcion que reciba un numero entero de
entre 0 y 999 (tendra entre 1 y 3 cifras) y devuelva como resultado:

- la suma de sus digitos. Por ejemplo si el numero fuera 23 la suma seria 5. 
- 1 si el número no esta comprendido entre 0 y 999

Ademas tendremos dos funciones que seran llamadas por la anterior para
realizar la suma en caso de que el numero sea de dos o tres cifras.

'''

def sumaDosDigitos(dig1, dig2) :
	dig1 += dig2
	print dig1
def sumaTresDigitos(p1,p2,p3) :
	suma = p1 + p2 + p3
	print suma
	
def sumar(numero) :
	if numero > 0 and numero < 1000 :
		if numero < 100 :
			digit = numero % 10
			numero /= 10
			sumaDosDigitos(numero,digit)
		else :
			digit1 = numero % 10
			numero /= 10
			digit2 = numero % 10
			numero /= 10
			sumaTresDigitos(numero,digit2,digit1)
	else :
		return -1

num = int(raw_input("Introduce un numero entre 1 y 999: "))

sumar(num)
