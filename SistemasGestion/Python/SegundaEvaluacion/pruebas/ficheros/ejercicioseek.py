#_*_coding:utf-8_*_

# Abrir un objeto file que le vamos a llamar archivo y vamos a abrir en modo lectura
archivo = open ("a.txt","r")

# Vamos a imprimir la primera linea
contenido = archivo.read(4)
print contenido

# Vamos a imprimir la segunda y tercera linea
archivo.seek(6)
contenido = archivo.read()
print contenido

# Vamos a imprimir la tercera linea
archivo.seek(11)
contenido = archivo.read()
print contenido
