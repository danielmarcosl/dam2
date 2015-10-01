#_*_coding:utf-8_*_

#Escribir un programa que guarde  en  una lista las notas que el usuario va a ir escribiendo mientras los valores introducidos 
#estén comprendidos entre 0 y 10. Una vez haya terminado nos tiene que mostrar todas las notas que haya guardado en la lista

lista = []

floatAux = float(raw_input("Introduzca nota: "))
while floatAux >= 0 and floatAux <= 10 :
	lista.append(floatAux)
	floatAux = float(raw_input("Introduzca nota: "))

print "\n",

print lista

print "\n",
