username= input("enter username:")
if len(username) <= 3:
    print("very short userename")
else:
    passw= input("entert the password:")
    if len(passw)<=5:
        print("short password")
    else:
        print("Succesfully logged in")
