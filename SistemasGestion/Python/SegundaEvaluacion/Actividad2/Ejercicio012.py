# -*- coding: utf-8 -*-

import math as m
import doctest as d

def cuadrado(x):
	return x**2

def cuadrado2(l):
    '''
    >>> cuadrado2([1,2,3,4,5])
    [1, 4, 9, 16, 25]
    >>> cuadrado2([6,7,8,9,10])
    [36, 49, 64, 81, 100]
    '''
    return map(cuadrado,l)


def factorial(y):
    '''
    >>> factorial(5)
    120
    >>> factorial(4)
    24
    '''
    return m.factorial(y)

if __name__ == "__main__":

    '''
    l=[1,2,3,4,5,]
    l2=[6,7,8,9,10]
    '''

    #print cuadrado2(l)

    #print factorial(5)

    print d.testmod()


