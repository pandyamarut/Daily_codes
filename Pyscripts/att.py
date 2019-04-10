def attcal(x):
    a = x/100
    if (a < 0.75):
        print("att is less")
    else:
        print("print att is good")
y = int(input("enter attendance %: "))
attcal(y)
