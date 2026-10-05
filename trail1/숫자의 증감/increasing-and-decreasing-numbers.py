c, n = input().split(" ")
n = int(n)
i = 1
if c == 'A':
    while i <= n:
        print(i, end=" ")
        i += 1
else:
    while n > 0:
        print(n, end=" ")
        n -= 1