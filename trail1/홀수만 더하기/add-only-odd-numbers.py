n = int(input())
sum = 0
for i in range(n):
    a = int(input())
    if a % 3 == 0 and a % 2 == 1:
        sum += a

print(sum)