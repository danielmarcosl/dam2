#_*_coding:utf-8_*_

import os

open("a.txt","r")

if os.access("a.txt", os.R_OK) :
	print "fichero ok, lectura ok"
else :
	print "fichero no ok"
