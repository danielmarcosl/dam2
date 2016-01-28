#_*_coding:utf-8_*_

with open ("a.txt","w+") as f:
	f.write ("hola\nnuevamente\ncompanero")
	
with open ("a.txt","r") as f:
	contenido = f.read()
	print contenido
