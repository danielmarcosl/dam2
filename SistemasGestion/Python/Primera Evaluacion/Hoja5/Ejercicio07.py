#_*_coding:utf-8_*_

i = 0
cont = 0
print "\nEjercicio 7"
tam = int(raw_input("Cuantos numeros va a introducir? "))
for i in range(tam):
	num = int(raw_input("Dime numero "))
	if num < 0:
		cont = cont +1

print "Numeros negativos: ",cont
	
