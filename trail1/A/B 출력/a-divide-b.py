a, b = map(int, input().split(" "))
tmp = 0
answer = ""
answer += str(a//b) + "."
count = 0 
while count <= 19:
    tmp = (a % b) * 10
    answer += str(tmp // b)
    a = tmp % b
    count += 1

print(answer)
