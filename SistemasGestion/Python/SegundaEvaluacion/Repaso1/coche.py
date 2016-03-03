#_*_coding:utf-8_*_

class Coche() :
	def __init__(self, gasolina) :
		self.gasolina = gasolina

	def obtener_gasolina(self) :
		return self.gasolina

	def modificar_gasolina(self, nueva) :
		self.gasolina = nueva
