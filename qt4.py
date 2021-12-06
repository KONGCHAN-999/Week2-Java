Weight = int(input("Enter your Weight number : "))
height = int(input("Enter your height number : "))
sum=100
sum=Weight+sum-height
if sum<0:
    print(sum," = You are in good shape")
else:
    print(sum," = You are obese")

