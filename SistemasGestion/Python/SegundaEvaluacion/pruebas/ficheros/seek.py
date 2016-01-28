#_*_coding:utf-8_*_

# Abrir un objeto file que le vamos a llamar archivo y vamos a abrir en modo lectura
# Vamos a leer de golpe toda la informacion y la vamos a mostrar por pantalla tal y como esta

archivo = open ("a.txt","r")

contenido = archivo.read()

print contenido

archivo.seek(6)

contenido = archivo.read()

print contenido
