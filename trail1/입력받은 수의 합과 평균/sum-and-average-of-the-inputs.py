n = int(input())
sum = cnt = 0
for i in range(n):
    sum += int(input())
    cnt += 1

print(f"{sum} {sum/cnt:.1f}")