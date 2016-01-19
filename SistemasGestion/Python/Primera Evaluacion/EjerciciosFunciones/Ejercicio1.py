#_*_coding:utf-8_*_

x = int(raw_input("Introduce un numero: "))

def suma() :
	a = lambda x : x + 2
	return a(x)
def multi() :
	b = lambda x : x * 3
	return b(x)

lista = [suma(), multi()]

for i in range(0,len(lista)) :
	print lista[i]
