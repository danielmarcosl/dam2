#_*_coding:utf-8_*_

import random

# Generar un número aleatorio entre el 1 y el 20
# Si ese número es menor de 10, mostrar que el valor generado tiene un dígito
# Si es mayor a 10, mostrar que tiene dos dígitos

num = int(random.randint(1,20))

if num < 10 :
	print "El numero " + str(num) + " tiene un digito"
elif num > 9 :
	print "El numero " + str(num) + " tiene dos digitos"
