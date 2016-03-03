#_*_coding:utf-8_*_

def revertir_palabra(s) :
	s2 = str()
	cont = len(s)
	while cont != 0 :
		s2 += s[cont - 1]
		cont -= 1
	return s2

def comprobar_palindromo(s1,s2) :
	for c,i in enumerate(s1) :
		if (s1[c] != s2[c]) :
			return "No son palindromos"
	return "Son palindromos"

# main

palabra1 = 'oso'
palabra2 = revertir_palabra(palabra1)

print comprobar_palindromo(palabra1, palabra2)
