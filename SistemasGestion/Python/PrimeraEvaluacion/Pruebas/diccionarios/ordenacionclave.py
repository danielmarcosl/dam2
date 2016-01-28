#_*_coding:utf-8_*_

import operator

diccionario={1:'DAM',3:'ASIR',35:'DAW',7:'SMR'}
print diccionario
print sorted (diccionario)
print sorted (diccionario, reverse = True)
print sorted (diccionario.items(), key=operator.itemgetter(1))
