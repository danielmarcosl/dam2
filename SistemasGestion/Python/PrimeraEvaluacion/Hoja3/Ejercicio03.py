#_*_coding:utf-8_*_

a = [66.25,333,333,1,1234.5]

# a) Cuantas veces se repite 333, 66.25 y 'x'
print a.count(333)
print a.count(66.25)
print a.count('x')

# b) Inserta en la posición 2 un -1
a.insert(2,-1)

# c) Añade al final un nuevo 333
a.append(333)

# d) Pinta la primera posición donde encontramos el primer 1
print a.index(1)

# e) Borra el primer 333
a.remove(333)

# f) Pinta la lista al revés
a.reverse()
print a

# g) Ordena la lista
a.sort()
print a
