a_age, a_gender = input().split(" ")
b_age, b_gender = input().split(" ")

if int(a_age) >= 19 and a_gender == "M" or int(b_age) >= 19 and b_gender == "M":
    print(1)
else:
    print(0)