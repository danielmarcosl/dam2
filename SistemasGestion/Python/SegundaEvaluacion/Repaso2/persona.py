#_*_coding:utf-8_*_

class Persona() :
	def __init__(self,*params) :
		self.nombre = params[0][0]
		self.dni = params[0][1]
		self.direccion = params[0][2]
		self.telefono = params[0][3]
		self.email = ''
		if len(params[0]) == 5 :
			self.email = params[0][4]

	def obtener_datos(self) :
		return [self.nombre,self.dni,self.direccion,self.telefono,self.email]
