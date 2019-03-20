odd_square = [x ** 2 for x in range(1, 11) if x % 2 == 1]
print (odd_square)

for i in odd_square:
    if i %3==0:
        print("multiple of 3 is: ",i)
