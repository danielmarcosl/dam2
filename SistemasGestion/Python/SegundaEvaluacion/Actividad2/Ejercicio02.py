#_*_coding:utf-8_*_

'''
Se nos pregunta que queremos comer hoy, debemos guardar los platos
de comida en una lista, pero como no estamos muy conformes con el
orden en que nos han ido dando los platos vamos a generar una lista
nueva con una secuencia aleatoria de los platos que guardamos.
Debemos usar el modulo pertinente y uno de sus metodos
'''

import random

platos = ["Melocotones","Fresas","Chocolate","Lays camperas","Cui a la brasa","Jamon","Kikos"]

platosAleatorios = random.sample(platos, len(platos))

print platosAleatorios
