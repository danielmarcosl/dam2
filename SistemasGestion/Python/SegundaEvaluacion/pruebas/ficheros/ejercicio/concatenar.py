#_*_coding:utf-8_*_

# concatenar a.txt y datos.txt

f1=open('a.txt','r')
f2=open('datos.txt','r')
f3=open('resultado.txt','w')
aux=''.join(f1.readlines()+f2.readlines())
f3.write(aux)
f1.close()
f2.close()
f3.close()
f3=open('resultado.txt','r')
print f3.read()
