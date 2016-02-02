#_*_coding:utf-8_*_

import doctest as d

def suma(a,b):
	'''
	>>>suma(0,0)
	0
	>>>suma(10,23)
	35
	'''
	return a + b
	
if __name__ == "__main__" :
	d.testmod()
