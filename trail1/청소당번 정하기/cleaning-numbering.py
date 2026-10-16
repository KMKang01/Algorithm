n = int(input())
classCount = 0
hallwayCount = 0
toiletCount = 0
for i in range(1, n+1):
    if i % 12 == 0:
        toiletCount += 1
    elif i % 3 == 0:
        hallwayCount += 1
    elif i % 2 == 0:
        classCount += 1

print(classCount, hallwayCount, toiletCount)