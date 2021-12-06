number = int(input("Enter your number : "))

m=number/2
prime=0
i=2

while i<=m:
    if number%i == 0:
        print(number," is not prime number")
        prime=1
        break
    if prime==0:
        print(number," is prime number")
        break