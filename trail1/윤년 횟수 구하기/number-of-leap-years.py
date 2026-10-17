n = int(input())
cnt = 0
for i in range(1, n+1):
    if i % 4 == 0:
        if i % 100 == 0:
            if i % 400 == 0:
                cnt += 1
        else:
            cnt += 1
print(cnt)