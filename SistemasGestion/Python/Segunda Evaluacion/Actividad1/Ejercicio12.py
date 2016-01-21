#_*_coding:utf-8_*_

'''
Crear una funcion a la que le pasamos una frase y
la debe trocear para poderla guardar en un fichero
'''

def trocearYguardar(f,s) :
	frase = s.split()
	
	for i in frase :
		f.write(i + '\n')

# main

f = open ('troceado.txt','w')

trocearYguardar(f,str(raw_input("Introduce una frase: ")))

f.close()

with open ('troceado.txt','r') as f2 :
	print f2.read()
