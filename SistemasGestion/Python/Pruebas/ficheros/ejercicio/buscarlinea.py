#_*_coding:utf-8_*_

archivo = open ("resultado.txt","r")

archivo.seek(35)

contenido = archivo.readline()

print contenido
