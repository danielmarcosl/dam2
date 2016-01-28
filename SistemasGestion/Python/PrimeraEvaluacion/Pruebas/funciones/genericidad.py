#_*_coding:utf-8_*_

def saluda(nombre):
	print"Hola %s"%nombre
	
def otrafuncion(funcion,parametro):
	print"Soy una funcion y ejecuto otra funcion"
	funcion(parametro)

f=saluda
otrafuncion(f,"Alvaro")
