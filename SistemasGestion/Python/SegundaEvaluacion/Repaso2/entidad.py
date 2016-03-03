#_*_coding:utf-8_*_

class Entidad() :
	def __init__(self, num, direc, client) :
		self.numero = num
		self.director = direc
		self.clientes = client

	def num_clientes(self) :
		return self.clientes
