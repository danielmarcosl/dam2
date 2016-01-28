import sys

'''
Funcion principal que imprima parametros pasados por sys.argv
'''

def principal(*a) :
	for i in a :
		print i

principal(sys.argv)
