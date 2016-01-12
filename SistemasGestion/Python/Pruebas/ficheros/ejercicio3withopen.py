#_*_coding:utf-8_*_

archivo = open ("a.txt","a")

lista = ["\nesto","\ntambien","\nlo","\nmeto"]
archivo.writelines(lista)
archivo.close()

archivo1 = open ("a.txt","r")

contenido = archivo1.read()

print contenido

archivo1.close()
