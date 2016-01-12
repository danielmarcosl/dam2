#_*_coding:utf-8_*_

with open ("a.txt","r") as f:
	contenido = f.readline()
	print contenido

print f.closed
