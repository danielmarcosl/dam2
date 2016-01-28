#_*_coding:utf-8_*_

import os

f = open ('toas.txt','r')

f.seek(0,0)
print f.readline()

f.seek(-13,2)
print f.read(6),

f.seek(2,1)
print f.readline()
