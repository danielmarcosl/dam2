#_*_coding:utf-8_*_

# Creamos las dos listas
numeros1 = [1,2,3,4]
numeros2 = [5,6,7,8]

# Declaramos una tercera y la dejamos vacia
numeros3 = list()

# Multiplicamos los valores de la misma posicion y los anadimos
for i in range(len(numeros1)) :
	numeros3.append(numeros1[i] * numeros2[i])

print numeros3
