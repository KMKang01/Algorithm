count3 = 0
count5 = 0
for i in range(0, 10):
    n = int(input())
    if n % 3 == 0:
        count3 += 1
    if n % 5 == 0:
        count5 += 1

print(count3, count5)