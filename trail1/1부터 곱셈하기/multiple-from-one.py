n = int(input())
res = 1
for i in range(1, 11):
    res *= i
    if res >= n:
        print(i)
        break