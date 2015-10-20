#_*_coding:utf-8_*_

import operator

diccionario = {'nombre':{'Primero':'XXX','Apellido':'YYY'},'trabajo':['desarrollador','jefe'],'edad':30}

print diccionario

print diccionario['nombre']['Apellido']

print diccionario['trabajo']

print diccionario ['trabajo'][-1]

diccionario ['trabajo'].append('junior')

print diccionario['trabajo']
