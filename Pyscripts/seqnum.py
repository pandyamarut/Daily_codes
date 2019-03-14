for i in range(int(input())):
    num=int(input())
    sum=0
    while (num!=0) :
        sum += int(num%10)
        num /=10
    print(sum)
