#_*_coding:utf-8_*_

# Escribe un programa que pregunte cuántos números se van a introducir
# pida esos números, y escriba el mayor, el menor y la media

cantidad = int(raw_input("Cuantos numeros deseas introducir? "))
lista = []
mayor = 0
menor = 0
suma = 0

for i in range(0,cantidad) :
	lista.append(raw_input("Introduce el " + str(i) + " numero: "))

print lista

for i in range(0,len(lista)) :
	if lista[i] > i :
		mayor = lista[i]
	if lista[i] < menor or menor == 0 :
		menor = lista[i]
		
print "El mayor es " + str(mayor)
print "El menor es " + str(menor)

j = 0

while j < len(lista) :
	suma += int(lista[j])
	j += 1

media = float(suma) / len(lista)

print media
