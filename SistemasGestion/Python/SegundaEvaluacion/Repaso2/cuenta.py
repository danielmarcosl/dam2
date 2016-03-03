#_*_coding:utf-8_*_

class Cuenta() :
	def __init__(self, s) :
		self.saldo = s

	def getSaldo(self) :
		return self.saldo

	def ingresar(self, f) :
		self.saldo += f

	def retirar(self, f) :
		self.saldo -= f
