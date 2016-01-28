#_*_ coding:utf-8_*_

def calcular(operacion) :
	def perimetro() :
		return str(valor * valor)
	def superficie() :
		return str(valor * valor)
	diccionario = {"perimetro":perimetro(),"superficie":superficie()}
	return diccionario[operacion]
	
valor = 5

print "El perimetro es " + calcular("perimetro")
print "La superficie es " + calcular("superficie")
