#_*_coding:utf-8_*_

import math

# Pedimos el radio de una esfera y lo guardamos en una variable de tipo float
radio = float(raw_input("Introduce el radio de una esfera: "))

# Calculamos e inicializamos el area
area = 4 * (math.pi * (radio ** 2))

# Imprimimos el area
print "El area es: " + str(area)

# Calculamos el volumen
volumen = 4/3 * (math.pi * (radio ** 3))

# Imprimimos el volumen
print "El volumen es: " + str(volumen)
