#_*_coding:utf-8_*_

'''
Usando funciones de alto nivel resolver el siguiente ejercicio

Tenemos una lista de valores como la siguiente
[(1,2),(2,3),(3,4),(4,5)]
Debemos generar una nueva lista con el producto de cada par de valores
Resultado
[(2),(6),(12),(20)]
'''

# main

lista = [(1,2),(2,3),(3,4),(4,5)]

print map(lambda a : a[0] * a[1],lista)
