#_*_coding:utf-8_*_

nums = []
suma = 0
j = 0

for i in range(0,5) :
	nums.append(int(raw_input("Introduce un numero: ")))
	
tuple(nums)

print "El valor maximo es " + str(max(nums))
print "El valor minimo es " + str(min(nums))

while j < len(nums) :
	suma += int(nums[j])
	j += 1

media = float(suma) / len(nums)

print "La media es " + str(media)
