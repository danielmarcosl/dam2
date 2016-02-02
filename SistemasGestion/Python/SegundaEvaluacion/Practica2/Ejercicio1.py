#_*_coding:utf-8_*_

'''
Vamos a realizar un fichero que  va a contener una serie de numero
introducidos por teclado de manera aleatoria.
Vamos a guardar esos datos en un fichero.
Mostraremos su contenido
A continuacion lo leeremos y deberemos decir que numeros
son pares y cuales impares.
'''

def comprobar_par(s) :
	lista = s.split()
	
	for i in lista :
		if int(i) % 2 == 0:
			print str(i) + " es par"
		else :
			print str(i) + " es impar"

# main

print "Introduce varios numeros separados por un espacio"
comprobar_par(raw_input("Tus numeros: "))
