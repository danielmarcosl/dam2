#_*_coding:utf-8_*_

# Creamos string
cadena = "el elefante avanza hacia asia"
# Creamos diccionario
diccionario = dict()

# Iteramos el string
for i,c in enumerate(cadena) :
	# Ignorar espacios en blanco
	if (c != " ") :
		# Si la letra ya esta aniadida, incrementar el valor
		if diccionario.has_key(c):
			num = diccionario.get(c)
			diccionario[c] = (num + 1)
		# Si no esta aniadida, aniadirla
		else :
			diccionario[c] = 1
			
# Mostrar claves y valores
for i,v in enumerate(diccionario) :
	print (v,diccionario[v]) ,
