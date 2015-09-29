#_*_coding:utf-8_*_

# Programa que lea 10 notas de examen con decimales
# Debe comprobar que este entre 0 y 10, sino lo vuelve a pedir
# Calcular y mostrar media, nota mas alta y mas baja

notas = []
menor = 0
mayor = 0
suma = 0

print "Introduce 10 notas con decimales"
for i in range(0,10) :
	num = float(raw_input("Introduce el " + str(i+1) + " numero: "))
	while num == 0 or num > 10 :
		num = (raw_input("Introduce el " + str(i+1) + " numero: "))
		notas.append(num)

j = 0

for j in range(0,len(notas)) :
	if notas[i] > mayor :
		mayor = notas[i]
	if menor < notas[i] or menor == 0:
		menor = notas[i]

print "El mayor es " + str(mayor)
print "El menor es " + str(menor)
