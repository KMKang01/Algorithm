n = int(input())
i = 1
while n >= 1:
    n //= i
    if n <= 1:
        break
    i += 1

print(i)