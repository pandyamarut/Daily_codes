list1 =[6,4,5,3,2,1]
z = max(list1)
while z in list1:
    list1.remove(z)
print(max(list1))
