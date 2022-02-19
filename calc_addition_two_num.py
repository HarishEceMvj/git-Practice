while True:
    print("this script perform only additon and subtraction")
    selection = input("enter the selection")
        

    if selection == addition:
        a = int(input("enter the number"))
        b = int(input("enter the number"))
        print("sum is ", a+b)
    elif selection == subtraction:
        a = int(input("enter the number"))
        b = int(input("enter the number"))

        print("subtraction is ", a-b)
    else:
        print("wrong selection')
