n = int(input())
arr = []
for i in range(n):
    if n % (i+1) == 0:
        arr.append(i+1)


sum = 0
for i in arr:
    if i != n:
        sum += i
# print(arr)
print("P" if sum == n else "N")