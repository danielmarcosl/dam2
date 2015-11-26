#_*_coding:utf-8_*_

'''Generaremos tres numeros aleatorios y
luego imprimiremos el mayor de los tres'''

# Importamos Random para poder generar numeros aleatorios
import random

# Generamos tres numeros aleatorios
num1 = random.randint(0,15)
num2 = random.randint(0,15)
num3 = random.randint(0,15)

# Si el num1 es mayor que los otros 2, lo pintamos
if (num1 > num2) and (num1 > num3) :
	print "El primer numero, " + str(num1) + ", es el mayor"
# Si el num2 es mayor que los otros 2, lo pintamos
elif (num2 > num1) and (num2 > num3) :
	print "El segundo numero, " + str(num2) + ", es el mayor"
# Si el num3 es mayor que los otros 2, lo pintamos
elif (num3 > num1) and (num3 > num2) :
	print "El tercer numero, " + str(num3) + ", es el mayor"
# En caso de que dos o más numeros sean iguales, metemos opciones
# Si num1 y num2 son iguales y son mayores que num3, los pintamos
elif (num1 == num2) and (num1 > num3) :
	print "El primer y segundo numero son iguales, " + str(num1) + ", y son los mayores"
# Si num1 y num3 son iguales y son mayores que num2, los pintamos
elif (num1 == num3) and (num1 > num2) :
	print "El primer y tercer numero son iguales, " + str(num1) + ", y son los mayores"
# Si num2 y num3 son iguales y son mayores que num1, los pintamos
elif (num2 == num3) and (num2 > num1) :
	print "El segundo y tercer numero son iguales, " + str(num2) + ", y son los mayores"
# Si los tres numeros son iguales, los pintamos
elif (num1 == num2) and (num2 == num3) :
	print "Los tres numeros son iguales, " + str(num1)
