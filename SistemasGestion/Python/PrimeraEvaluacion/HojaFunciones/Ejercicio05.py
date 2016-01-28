#_*_coding:utf-8_*_

def crear_cadenas(silaba,*cadenas) :
	for i in cadenas :
		print silaba + i
		
print crear_cadenas("bi","cicleta","polar","-bo-bu","p del avernoo")
