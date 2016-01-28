#_*_coding:utf-8_*_

def f1(a,b) :
	c = a + 2 * b
	d = b ** 2
	return c + d
	
a = 3
b = 2
c = f1(b,a)
d = f1(a,b)
print c,d

def f2(x):
	a = x ** 2
	b = a + g(a)
	return a * b

def g(x):
	a = x * 3
	return a ** 2
	
m = f2(1)
n = g(1)
print m, n

def f3(n):
	if n == 0 or n == 1:
		return 1
	a = f3(n - 2)
	b = f3(n - 1)
	s = a + b
	return s

print f3(5)
