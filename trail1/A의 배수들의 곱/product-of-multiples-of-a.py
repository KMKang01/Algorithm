a, b= map(int, input().split(" "))
n = sum = 1
while n < (b + 1):
    if n % a == 0:
        sum *= n
    n += 1
print(sum)