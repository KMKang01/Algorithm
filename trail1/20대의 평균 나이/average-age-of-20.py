i = sum = 0
while True:
    n = int(input())
    if n >= 30 or n < 20:
        break
    i += 1
    sum += n
print(f"{sum/i:.2f}")