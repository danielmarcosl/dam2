#_*_coding:utf-8_*_

'''Realizar un programa que pida un numero entero al usuario
e informe del valor del cociente y el resto de dividirlo por dos'''

# Pedimos un numero al usuario y lo guardamos en una variable
num = float(raw_input("Introduce un numero: "))

# Calculamos cociente y resto
cociente = float(num / 2)
resto = float(num % 2)

# Imprimimos
print "El cociente es " + str(cociente) + ", y el resto es " + str(resto)
