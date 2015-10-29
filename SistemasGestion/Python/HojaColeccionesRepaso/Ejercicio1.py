#_*_coding:utf-8_*_

individuos = {'francia':23,'alemania':10,'italia':130}

# Indiviuos de francia
print individuos.get('francia')

# Anadir 40 individuos a belgica
individuos['belgica'] = 40

# Borrar datos de italia
individuos.pop('italia')

# Incrementar en 2 el value de alemania
individuos['alemania'] += 2

print individuos
