#_*_coding:utf-8_*_

def funcionDeImpares(p1, *impares) :
	for i in impares :
		if i % 2 != 0 :
			print "numero " + str(i) + " es impar"
		else :
			print "numero " + str(i) + " no es impar"
		
	print "Se han introducido ",	
	print len(impares),
	print " numeros"
		
	media = 0
		
	for i in impares :
		media += i
			
	media = media / len(impares)
		
	print "la media es " + str(media)
		
	print "el minimo es " + str(min(impares))
	print "el maximo es " + str(max(impares))

funcionDeImpares('hola',1,3,5,7,9,11,13)
