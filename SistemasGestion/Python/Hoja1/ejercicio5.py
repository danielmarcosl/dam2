#_*_coding:utf-8_*_

'''Realizar un programa que pida cinco numeros decimales,
calcule su media e informe del resultado por pantalla.'''

# Pedimos cinco numeros al usuario y los almacenamos en variables float
num1 = float(raw_input("Introduce un numero: "))
num2 = float(raw_input("Introduce un numero: "))
num3 = float(raw_input("Introduce un numero: "))
num4 = float(raw_input("Introduce un numero: "))
num5 = float(raw_input("Introduce un numero: "))

# Calculamos la media
media = (num1 + num2 + num3 + num4 + num5) / 5

# Lo imprimimos
print str(media)
