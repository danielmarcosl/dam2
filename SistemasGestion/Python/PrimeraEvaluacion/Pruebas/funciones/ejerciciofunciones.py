#_*_coding:utf-8_*_

def saludar(lengua) :
	def saludar_es() :
		return "Hola"
	def saludar_en() :
		return "Hello"
	def saludar_fr() :
		return "Salut"
	diccionario = {"es":saludar_es(),"en":saludar_en(),"fr":saludar_fr()}
	return diccionario[lengua]	

f = saludar("fr")

print f
