#_*_coding:utf-8_*_

with open ("a.txt","a") as f:
	f.write ("\ngluglugluglu")
	
f1 = open("a.txt","r")

contenido = f1.read()
print contenido

f1.close()
