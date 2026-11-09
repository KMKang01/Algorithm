n = int(input())
while True:
    if n < 25:
        print("Higher")
    elif n > 25:
        print("Lower")
    else:
        print("Good")
        break
    n = int(input())