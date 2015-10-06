#_*_coding:utf-8_*_

sec = "1#2#3#7#10"

# Generar una lista con los valores introducidos
sec = sec.split("#")
print sec

# añadir
sec1 = "8#6#2#0"

sec += sec1.split("#")
print sec
# Convertir la lista resultando en una tupla

tuple(sec)
print sec

#Valor max y min de la tupla
print "El min es " + str(min(sec))
print "El max es " + str(max(sec))

#Mostrar contenidos de la lista usando valores negativos
print sec(-9)
