a_math, a_eng = map(int, input().split(" "))
b_math, b_eng = map(int, input().split(" "))

if a_math > b_math:
    print("A")
elif a_math == b_math:
    print("A" if a_eng > b_eng else "B")
else:
    print("B")