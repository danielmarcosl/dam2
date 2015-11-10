#_*_coding:utf-8_*_

def hacer_sumador(k) :
	def sumador(x) :
		return x + k
		
	return sumador

suma_dos = hacer_sumador(2)
print suma_dos(3)
