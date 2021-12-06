x = 12
y = 18
i = 1
while i <= x and i <= y:
    if x % i == 0 and y % i == 0:
        sum = i
    i = i+1
print(x, y, " = ", sum)
