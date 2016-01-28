#_*_coding:utf-8_*_

def calcular_media(*valores) :
	media = 0
	
	for i in valores :
		media += i
		
	media / len(valores)
	return media
	
print calcular_media(3,5,10)
