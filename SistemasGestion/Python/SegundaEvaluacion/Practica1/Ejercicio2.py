#_*_coding:utf-8_*_

'''
Definir una  funcion donde vamos a pasar un numero indeterminado
de parametros, lo que queremos que haga nuestra función es:

Queremos que dichos parametros se guarden en un fichero pero debemos
controlar que “no queremos que se guarden parametros repetidos“.

Al final debemos leer el contenido del fichero
y ademas que nos muestre la cantidad 
'''

def comprobarDuplicados(s) :
	lista = s.split()
	
	for i in lista :
		if lista.count(i) > 1 :
			lista.remove(i)
	return lista

def escribirParametros(l) :
	with open ('f2.txt','w') as f :
		for i in l :
			f.write(i + ' ')

# main

print "Escribe parametros separados por un espacio"

escribirParametros(comprobarDuplicados(str(raw_input("Tus parametros: "))))

with open ('f2.txt','r') as f2 :
	print f2.read()
