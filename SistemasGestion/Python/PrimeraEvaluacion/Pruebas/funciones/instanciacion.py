#_*_coding:utf-8_*_

def devuelve(param) :
	if param : 
		return "Adios"
	else :
		return "Hola"

f = devuelve(True)
print f
f = devuelve(False)
print f
