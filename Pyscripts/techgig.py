# Comparing two lists. 
for i in range(int(input())):
    n = int(input())
    A = list(map(int, input().strip().split(" ")))
    B = list(map(int, input().strip().split(" ")))
    A.sort()
    B.sort()
    p = 0
    j = 0
    for i in B:
        if i > A[j]:
            p += 1
        j += 1
    if p == len(B):
        print("WIN")
    else:
        print("LOSE")
