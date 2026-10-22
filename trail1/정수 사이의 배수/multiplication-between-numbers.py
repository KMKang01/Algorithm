a, b = map(int, input().split(" "))
cnt = 0
sum = 0
for i in range(a, b+1, 1):
    if i % 5 == 0 or i % 7 == 0:
        cnt += 1
        sum += i

print(f"{sum} {sum/cnt:.1f}")