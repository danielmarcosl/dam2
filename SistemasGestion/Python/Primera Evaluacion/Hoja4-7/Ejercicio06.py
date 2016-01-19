#_*_coding:utf-8_*_

# Creamos un string
cadena = "el gato y el pato son amigos"
# Troceamos el string y lo convertimos en lista
lista = cadena.split()
# Creamos diccionario
diccionario = dict()

for i,c in enumerate(lista) :
	# Aniadimos al diccionario cada palabra del string
	diccionario[c] = 0

	# Contamos el numero de letras
	for j,d in enumerate(c) :
		num = diccionario.get(c)
		num += 1
		diccionario[c] = num

# Imprimimos resultado
for a,b in enumerate(diccionario) :
	print b,diccionario[b]
