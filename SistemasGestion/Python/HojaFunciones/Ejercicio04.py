#_*_coding:utf-8_*_

def calculo_impuestos(x) :
	precio = lambda x : x * 1.21
	return precio(x)
	
producto1 = 40
producto2 = 35.4

print "El precio del primer producto es " + str(producto1) + ", " + str(calculo_impuestos(producto1)) + " con iva"
print "El precio del segundo producto es " + str(producto2) + ", " + str(calculo_impuestos(producto2)) + " con iva"
