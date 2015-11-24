#_*_coding:utf-8_*_

def imprimeLista(L):
    # si esta vacia no hacemos nada
    if not L: return 
    # si es una lista llamamos a imprimeLista para el primer elemento
    if type(L[0]) == type([]):
        imprimeLista(L[0])
    else: #no es una lista, simplemente imprimimos 
        print L[0] 
    # ahora procesamos el resto de L 
    imprimeLista(L[1:])

L=[1,2,3,4,[5,6]]
print imprimeLista(L)
