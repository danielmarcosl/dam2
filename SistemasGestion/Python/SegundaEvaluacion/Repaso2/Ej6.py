#_*_coding:utf-8_*_

'''
Cree una clase llamada Cuenta. Como atributo tendra un numero float llamado
saldo, con una cantidad inicial de 0 euros.

Tendra dos metodos:
	- Ingresar, con un parametro que indica la cantidad a sumar al saldo
	- Retirar, con un parametro que sera un numero float de euros a restar del saldo

Cree un programa para ingresar 125.23, 503.4 y 50 euros y luego retire 333.34 euros.
Muestre tras cada operacion el saldo de la cuenta
'''

from cuenta import Cuenta

# main

cuenta = Cuenta(0)

cuenta.ingresar(125.23)
print cuenta.getSaldo()

cuenta.ingresar(503.4)
print cuenta.getSaldo()

cuenta.ingresar(50)
print cuenta.getSaldo()

cuenta.retirar(333.34)
print cuenta.getSaldo()
