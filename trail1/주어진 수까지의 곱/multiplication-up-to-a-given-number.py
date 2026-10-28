a, b = map(int, input().split(" "))
answer = 1
for i in range(a, b+1):
    answer *= i

print(answer)