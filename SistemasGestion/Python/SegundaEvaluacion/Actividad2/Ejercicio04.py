#_*_coding:utf-8_*_

'''Hacer una funcion que recibe un numero y contesta "par" o "impar" en funcion de si el numero es par o no.
Debemos  agregarle un docstring (con pruebas incluidas,)'''

def parimpar(num):
	
    """Devuelve par o impar.

    >>> parimpar(1)
    'impar'

    >>> parimpar(2)
    'par'
	>>> parimpar(3)
	'par'
    """

    if num % 2:
        return "impar"
    else:
        return "par"


if __name__ == "__main__":

    import doctest
    print(doctest.testmod())
