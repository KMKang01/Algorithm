n = int(input())
i = 0
while n != 1:
    if n % 2 == 0:
        n //= 2
    else:
        n = n*3+1
    i += 1
print(i)