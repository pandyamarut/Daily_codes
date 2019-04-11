// SolutionforNoideapprobOnHackerrank.



n,m = map(int, input().split(" "))
arr = input().split(" ")
A = set(input().split(" "))
B = set(input().split(" "))
hap = 0
for i in arr:
    if i in A:
        hap +=1
    if i in B:
        hap -=1
print(hap)
