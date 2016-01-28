#_*_coding:utf-8_*_

import os

f = open ('prueba.txt','r')

f.seek(0,0)
print f.readline()

f.seek(0,1)
print f.readline()

f.seek(0,1)
print f.readline()

f.seek(0,1)
print f.readline()

f.seek(-8,2)
print f.readline()
