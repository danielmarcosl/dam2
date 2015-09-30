#_*_coding:utf-8_*_

tupla = ("CARAMELO","camaleon","geany","MAXIMO","firefox")
mayor = 0

for i in range(0,len(tupla)) :
	if tupla[i] != tupla[i].lower() and tupla[i] == tupla[i].upper() :
		mayor += 1

print mayor
