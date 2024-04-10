hour, minute, second = (map(int, input().split()))
line2 = int(input())

a = line2 // 3600
line2 -= a*3600
b = line2 // 60
line2 -= b*60
c = line2

hour += a
minute += b
second += c
if second >= 60:
    minute += 1
    second %= 60
if minute >= 60:
    hour += 1
    minute %= 60
if hour >= 24:
    hour %= 24

print(str(hour)+" "+str(minute)+" "+str(second))
