#_*_coding:utf-8_*_

def imprimeLista(L):
    if L:
        print L[0]
        imprimeLista(L[1:])

L=[1,2,3,]

imprimeLista(L)
