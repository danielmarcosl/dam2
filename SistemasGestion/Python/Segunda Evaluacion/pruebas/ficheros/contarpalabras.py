#_*_coding:utf-8_*_

import string

def numpalabras(s) :
	lista = string.split(s)
	return len(lista)
	

with open ("prueba.txt","w") as f:
	for i in range(5) :
		f.write(raw_input("Introduce algo: ") + "\n")

archivo = open ('prueba.txt','r')

total = 0

for i in archivo.readlines() :
	total += numpalabras(i)

print total
