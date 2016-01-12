#_*_coding:utf-8_*_

import os

def comprobar_tipo (a) :
	if os.path.isfile(a):
		return "fichero"
	if os.path.isdir(a):
		return "directorio"
	else:
		return "cualquier cosida"

print comprobar_tipo("a.txt")
